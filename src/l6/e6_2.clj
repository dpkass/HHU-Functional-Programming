(ns l6.e6-2
  (:use [l6.e6-1]))

(comment "The following exercise asks you to implement different functions operating on a graph.
As representation of the graph we use a map.")

(def g {:nodes #{:a :c :b :d :e},
        :edges #{[:a :b] [:b :c]
                 [:c :d] [:c :e]}})



(comment "a) Write a function (defn dom [g] ...), which returns a subset of nodes that have an
outgoing edge.")

(defn dom [g]
  (into #{} (map first (:edges g))))

(dom g)



(comment "b) Write a function (defn ran [g] ...), which returns a subset of nodes that have an
incoming edge.")

(defn ran [g]
  (into #{} (map second (:edges g))))

(ran g)



(comment "c) Implement a function (defn tc [g] ...), which takes a graph as a parameter and
returns a graph describing the transitive closure of the input.

Note: Consider whether you can use the fixed point function or a generalized version of a fixed
point function to do this.")

(defn to-map [edges]
  (reduce
   (fn [m [from to]] (assoc m from (set (conj (from m) to))))
   {}
   edges))

(defn to-tuples [edges-map]
  (reduce
   (fn [edges [from to]]
     (into edges (map #(vector from %) to)))
   #{}
   edges-map))

(defn tc [g]
  (assoc g :edges (to-tuples
                   (loop [em (to-map (:edges g))]
                     (let [new-em (into em
                                        (for [from (dom g) to (from em)]
                                          [from (clojure.set/union (from em) (to em))]))]
                       (if (= new-em em) new-em (recur new-em)))))))

(tc g)


(comment "or using the fixed point function")

(defn tc [g]
  (assoc g
    :edges (fixedpoint
            (fn [edges]
              (into edges
                    (for [[from to] edges
                          [to-from to-to] edges
                          :when (= to to-from)]
                      [from to-to])))
            (:edges g)
            =)))

(tc g)
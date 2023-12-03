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



(comment "d) Implement the function (defn trc [g] ...), which computes the transitive, reflexive closure.")

(defn trc [g]
  (assoc g :edges (into
                   (:edges (tc g))
                   (map #(vector % %) (:nodes g)))))

(trc g)



(comment "e) Write a predicate (defn path? [g start end] ...), that returns a truthy value if
Graph g contains a path from start to end or a falsey value if there is no such path. Make sure
that your predicate also terminates if the graph is cyclic.")

; simplest (and probably intended) impl is using trc and looking if the edge is there
; it's very inefficient of course

(defn path? [g start end]
  (> (count (filter #(= % [start end]) (:edges (trc g)))) 0))

(true? (path? g :a :a))
(true? (path? g :a :c))
(false? (path? g :c :a))
(false? (path? g :e :a))


; making sure it terminates even if graph is cyclic

(def h {:nodes #{:a :c :b :d},
        :edges #{[:a :b] [:b :c]
                 [:c :a] [:c :d]}})

(true? (path? h :a :a))
(true? (path? h :a :c))
(true? (path? h :c :a))
(false? (path? h :d :a))

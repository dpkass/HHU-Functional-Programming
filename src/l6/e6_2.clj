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
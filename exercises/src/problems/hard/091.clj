(ns problems.hard.091)

(comment "Graph Connectivity")


(comment "Given a graph, determine whether the graph is connected.
A connected graph is such that
a path exists between any two given nodes.

-Your function must return true if
 the graph is connected and false otherwise.

-You will be given a set of tuples
 representing the edges of a graph.
 Each member of a tuple being a vertex/node in the graph.

-Each edge is undirected (can be traversed either direction).")


(defn solution
  [& args])


(assert (and (= true (solution #{[:a :a]}))
             (= true (solution #{[:a :b]}))
             (= false (solution #{[2 3] [6 4] [5 6] [4 5] [3 1] [1 2]}))
             (= true (solution #{[2 3] [3 4] [6 4] [5 6] [4 5] [3 1] [1 2]}))
             (= false (solution #{[:b :e] [:c :d] [:x :y] [:a :b] [:d :a] [:b :c]}))
             (= true (solution #{[:b :e] [:c :d] [:x :y] [:a :b] [:d :a] [:x :a] [:b :c]}))))

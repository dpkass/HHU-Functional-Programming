(ns problems.hard.089)

(comment "Graph Tour")


(comment "Starting with a graph you must write a function
that returns true if it is possible to make
a tour of the graph in which every edge is visited exactly once.

The graph is represented by a vector of tuples,
where each tuple represents a single edge.

The rules are:

- You can start at any node.
- You must visit each edge exactly once.
- All edges are undirected.")


(defn solution
  [& args])


(assert (and (= true (solution [[:a :b]]))
             (= false (solution [[:a :a] [:b :b]]))
             (= false (solution [[:a :b] [:a :b] [:a :c] [:c :a] [:a :d] [:b :d] [:c :d]]))
             (= true (solution [[1 2] [2 3] [3 4] [4 1]]))
             (= true (solution [[:a :b] [:a :c] [:c :b] [:a :e] [:b :e] [:a :d] [:b :d] [:c :e] [:d :e] [:c :f] [:d :f]]))
             (= false (solution [[1 2] [2 3] [2 4] [2 5]]))))

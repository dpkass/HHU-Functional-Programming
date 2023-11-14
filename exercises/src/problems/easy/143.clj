(ns problems.easy.143)

(comment "dot product")


(comment "Create a function that computes the dot product of two sequences.
You may assume that the vectors will have the same length.")


(defn solution
  [& args])


(assert (and (= 0 (solution [0 1 0] [1 0 0]))
             (= 3 (solution [1 1 1] [1 1 1]))
             (= 32 (solution [1 2 3] [4 5 6]))
             (= 256 (solution [2 5 6] [100 10 1]))))

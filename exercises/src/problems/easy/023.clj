(ns problems.easy.023)

(comment "Reverse a Sequence")

(comment "Write a function which reverses a sequence.")


(defn solution
  [& args])


(assert (and (= (solution [1 2 3 4 5]) [5 4 3 2 1])
             (= (solution (sorted-set 5 7 2 7)) (quote (7 5 2)))
             (= (solution [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]])))

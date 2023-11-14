(ns problems.easy.033)

(comment "Replicate a Sequence")


(comment "Write a function which replicates each
element of a sequence a variable number of times.")


(defn solution
  [& args])


(assert (and (= (solution [1 2 3] 2) (quote (1 1 2 2 3 3)))
             (= (solution [:a :b] 4) (quote (:a :a :a :a :b :b :b :b)))
             (= (solution [4 5 6] 1) (quote (4 5 6)))
             (= (solution [[1 2] [3 4]] 2) (quote ([1 2] [1 2] [3 4] [3 4])))
             (= (solution [44 33] 2) [44 44 33 33])))

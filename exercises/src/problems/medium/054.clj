(ns problems.medium.054)

(comment "Partition a Sequence")


(comment "Write a function which returns
a sequence of lists of x items each.
Lists of less than x items should not be returned.")


(defn solution
  [& args])


(assert (and (= (solution 3 (range 9)) (quote ((0 1 2) (3 4 5) (6 7 8))))
             (= (solution 2 (range 8)) (quote ((0 1) (2 3) (4 5) (6 7))))
             (= (solution 3 (range 8)) (quote ((0 1 2) (3 4 5))))))

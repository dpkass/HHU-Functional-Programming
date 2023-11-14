(ns problems.medium.044)

(comment "Rotate Sequence")


(comment "Write a function which
can rotate a sequence in either direction.")


(defn solution
  [& args])


(assert (and (= (solution 2 [1 2 3 4 5]) (quote (3 4 5 1 2)))
             (= (solution -2 [1 2 3 4 5]) (quote (4 5 1 2 3)))
             (= (solution 6 [1 2 3 4 5]) (quote (2 3 4 5 1)))
             (= (solution 1 (quote (:a :b :c))) (quote (:b :c :a)))
             (= (solution -4 (quote (:a :b :c))) (quote (:c :a :b)))))

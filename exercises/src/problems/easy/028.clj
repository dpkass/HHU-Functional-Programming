(ns problems.easy.028)

(comment "Flatten a Sequence")

(comment "Write a function which flattens a sequence.")


(defn solution
  [& args])


(assert (and (= (solution (quote ((1 2) 3 [4 [5 6]]))) (quote (1 2 3 4 5 6)))
             (= (solution ["a" ["b"] "c"]) (quote ("a" "b" "c")))
             (= (solution (quote ((((:a)))))) (quote (:a)))))

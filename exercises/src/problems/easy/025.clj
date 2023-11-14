(ns problems.easy.025)

(comment "Find the odd numbers")


(comment "Write a function which returns
only the odd numbers from a sequence.")


(defn solution
  [& args])


(assert (and (= (solution #{1 4 3 2 5}) (quote (1 3 5)))
             (= (solution [4 2 1 6]) (quote (1)))
             (= (solution [2 2 4 6]) (quote ()))
             (= (solution [1 1 1 3]) (quote (1 1 1 3)))))

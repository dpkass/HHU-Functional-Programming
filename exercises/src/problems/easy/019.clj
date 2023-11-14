(ns problems.easy.019)

(comment "Last Element")


(comment "Write a function which returns
the last element in a sequence.")


(defn solution
  [& args])


(assert (and (= (solution [1 2 3 4 5]) 5)
             (= (solution (quote (5 4 3))) 3)
             (= (solution ["b" "c" "d"]) "d")))

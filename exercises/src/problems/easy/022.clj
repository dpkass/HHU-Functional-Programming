(ns problems.easy.022)

(comment "Count a Sequence")


(comment "Write a function which returns
the total number of elements in a sequence.")


(defn solution
  [& args])


(assert (and (= (solution (quote (1 2 3 3 1))) 5)
             (= (solution "Hello World") 11)
             (= (solution [[1 2] [3 4] [5 6]]) 3)
             (= (solution (quote (13))) 1)
             (= (solution (quote (:a :b :c))) 3)))

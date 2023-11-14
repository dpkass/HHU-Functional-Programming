(ns solved.020)

(comment "Penultimate Element")


(comment "Write a function which returns
the second to last element from a sequence.")


(defn solution
  [col] (second (reverse col)))


(assert (and (= (solution (list 1 2 3 4 5)) 4)
             (= (solution ["a" "b" "c"]) "b")
             (= (solution [[1 2] [3 4]]) [1 2])))

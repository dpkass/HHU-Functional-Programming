(ns solved.024)

(comment "Sum It All Up")


(comment "Write a function which returns
the sum of a sequence of numbers.")


(defn solution
  [col] (apply + col))

(assert (and (= (solution [1 2 3]) 6)
             (= (solution (list 0 -2 5 5)) 8)
             (= (solution #{1 4 2}) 7)
             (= (solution (quote (0 0 -1))) -1)
             (= (solution (quote (1 10 3))) 14)))

(ns problems.easy.120)

(comment "Sum of square of digits")


(comment "Write a function which takes
a collection of integers as an argument.
Return the count of how many elements are smaller than
the sum of their squared component digits.
For example: 10 is larger than 1 squared plus 0 squared;
whereas 15 is smaller than 1 squared plus 5 squared.")


(defn solution
  [& args])


(assert (and (= 8 (solution (range 10)))
             (= 19 (solution (range 30)))
             (= 50 (solution (range 100)))
             (= 50 (solution (range 1000)))))

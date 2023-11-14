(ns problems.medium.080)

(comment "Perfect Numbers")


(comment "A number is "perfect" if the sum of its divisors
equal the number itself.
6 is a perfect number because 1+2+3=6.
Write a function which returns true for perfect numbers
and false otherwise.")


(defn solution
  [& args])


(assert (and (= (solution 6) true)
             (= (solution 7) false)
             (= (solution 496) true)
             (= (solution 500) false)
             (= (solution 8128) true)))

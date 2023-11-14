(ns problems.medium.086)

(comment "Happy numbers")


(comment "Happy numbers are positive integers that
follow a particular formula:
take each individual digit, square it,
and then sum the squares to get a new number.
Repeat with the new number and eventually,
you might get to a number whose squared sum is 1.
This is a happy number.
An unhappy number (or sad number) is one that loops endlessly.
Write a function that determines if a number is happy or not.")


(defn solution
  [& args])


(assert (and (= (solution 7) true)
             (= (solution 986543210) true)
             (= (solution 2) false)
             (= (solution 3) false)))

(ns problems.easy.135)

(comment "Infix Calculator")


(comment "Your friend Joe is always whining about Lisps using the prefix
notation for math. Show him how you could easily write a function that does math
using the infix notation. Is your favorite language that flexible, Joe? Write a
function that accepts a variable length mathematical expression consisting of
numbers and the operations +, -, *, and /. Assume a simple calculator that does
not do precedence and instead just calculates left to right.")


(defn solution
  [& args])


(assert (and (= 7 (solution 2 + 5))
             (= 42 (solution 38 + 48 - 2 / 2))
             (= 8 (solution 10 / 2 - 1 * 2))
             (= 72 (solution 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))))

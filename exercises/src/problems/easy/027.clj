(ns problems.easy.027)

(comment "Palindrome Detector")


(comment "Write a function which returns true
if the given sequence is a palindrome.

Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)")


(defn solution
  [& args])


(assert (and (false? (solution (quote (1 2 3 4 5))))
             (true? (solution "racecar"))
             (true? (solution [:foo :bar :foo]))
             (true? (solution (quote (1 1 3 3 1 1))))
             (false? (solution (quote (:a :b :c))))))

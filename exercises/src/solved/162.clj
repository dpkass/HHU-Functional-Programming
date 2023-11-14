(ns solved.162)

(comment "Logical falsity and truth")


(comment "In Clojure, only nil and false represent the values of logical
falsity in conditional tests - anything else is logical truth.")


(def solution 1)


(assert (and (= solution (if-not false 1 0))
             (= solution (if-not nil 1 0))
             (= solution (if true 1 0))
             (= solution (if [] 1 0))
             (= solution (if [0] 1 0))
             (= solution (if 0 1 0))
             (= solution (if 1 1 0))))

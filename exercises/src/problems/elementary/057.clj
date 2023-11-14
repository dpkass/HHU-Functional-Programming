(ns problems.elementary.057)

(comment "Simple Recursion")


(comment "A recursive function is a function which calls itself.
This is one of the fundamental techniques
used in functional programming.")


(def solution nil)

(assert (and (= solution ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))))

(ns problems.elementary.007)

(comment "conj on vectors")


(comment "When operating on a Vector,
the conj function will return a new vector
with one or more items "added" to the end.")


(def solution nil)


(assert (and (= solution (conj [1 2 3] 4))
             (= solution (conj [1 2] 3 4))))

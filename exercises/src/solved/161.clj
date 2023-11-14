(ns solved.161)

(comment "Subset and Superset")


(comment "Set A is a subset of set B, or equivalently B is a superset of A,
    if A is "contained" inside B. A and B may coincide.")


(def solution #{1 2})


(assert (and (clojure.set/superset? solution #{2})
             (clojure.set/subset? #{1} solution)
             (clojure.set/superset? solution #{1 2})
             (clojure.set/subset? #{1 2} solution)))

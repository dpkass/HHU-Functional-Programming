(ns problems.elementary.011)

(comment "conj on maps")


(comment "When operating on a map,
the conj function returns a new map
with one or more key-value pairs "added".")


(def solution nil)

(assert (and (= {:a 1, :b 2, :c 3} (conj {:a 1} solution [:c 3]))))

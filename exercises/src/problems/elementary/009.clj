(ns problems.elementary.009)

(comment "conj on sets")


(comment "When operating on a set,
the conj function returns a new set with one or more keys "added".")


(def solution nil)

(assert (and (= #{1 4 3 2} (conj #{1 4 3} solution))))

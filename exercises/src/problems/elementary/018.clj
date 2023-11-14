(ns problems.elementary.018)

(comment "filter")


(comment "The filter function takes two arguments:
a predicate function (f) and a sequence (s).
Filter returns a new sequence consisting
of all the items of s for which (f item) returns true.")


(def solution nil)

(assert (and (= solution (filter (fn* [p1__4820#] (> p1__4820# 5)) (quote (3 4 5 6 7))))))

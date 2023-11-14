(ns problems.elementary.012)

(comment "Sequences")


(comment "All Clojure collections support sequencing.
You can operate on sequences with functions
like first, second, and last.")


(def solution nil)


(assert (and (= solution (first (quote (3 2 1))))
             (= solution (second [2 3 4]))
             (= solution (last (list 1 2 3)))))

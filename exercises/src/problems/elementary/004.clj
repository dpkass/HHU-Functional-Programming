(ns problems.elementary.004)

(comment "Lists")


(comment "Lists can be constructed with either
a function or a quoted form.")


(def solution (list ,,,))

(assert (and (= solution (quote (:a :b :c)))))

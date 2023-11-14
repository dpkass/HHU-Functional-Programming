(ns solved.006)

(comment "Vectors")


(comment "Vectors can be constructed several ways.
You can compare them with lists.")


(def solution [:a,:b,:c,])

(assert (and (= solution (list :a :b :c) (vec (quote (:a :b :c))) (vector :a :b :c))))

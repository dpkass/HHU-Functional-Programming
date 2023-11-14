(ns solved.013)

(comment "rest")


(comment "The rest function will return all the items
of a sequence except the first.")


(def solution [20 30 40])

(assert (and (= solution (rest [10 20 30 40]))))

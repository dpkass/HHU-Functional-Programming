(ns solved.005)

(comment "conj on lists")


(comment "When operating on a list,
the conj function will return a new list
with one or more items "added" to the front.")


(def solution (quote (1 2 3 4)))


(assert (and (= solution (conj (quote (2 3 4)) 1))
             (= solution (conj (quote (3 4)) 2 1))))

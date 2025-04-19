(ns problems.easy.048)

(comment "Intro to some")


(comment "The some function takes
a predicate function and a collection.
It returns the first logical true value of (predicate x)
where x is an item in the collection.")


(def solution nil)


(assert (and (= solution (some #{7 6 2} [5 6 7 8]))
             (= solution (some (fn* [p1__4822#] (when (even? p1__4822#) p1__4822#)) [5 6 7 8]))))

(ns solved.064)

(comment "Intro to Reduce")


(comment "Reduce takes a 2 argument function
and an optional starting value.
It then applies the function to the first 2 items in the sequence
(or the starting value and the first element of the sequence).
In the next iteration the function will be called on
the previous return value and the next item from the sequence,
thus reducing the entire collection to one value.
Don't worry, it's not as complicated as it sounds.")


(def solution +)


(assert (and (= 15 (reduce solution [1 2 3 4 5]))
             (= 0 (reduce solution []))
             (= 6 (reduce solution 1 [2 3]))))

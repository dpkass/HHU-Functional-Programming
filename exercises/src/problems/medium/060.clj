(ns problems.medium.060)

(comment "Sequence Reductions")


(comment "Write a function which behaves like reduce,
but returns each intermediate value of the reduction.
Your function must accept either two or three arguments,
and the return sequence must be lazy.")


(defn solution
  [& args])


(assert (and (= (take 5 (solution + (range))) [0 1 3 6 10])
             (= (solution conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])
             (= (last (solution * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)))

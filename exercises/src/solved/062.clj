(ns problems.easy.062)

(comment "Re-implement Iteration")


(comment "Given a side-effect free function f
and an initial value x
write a function which returns an infinite lazy sequence
of x, (f x), (f (f x)), (f (f (f x))), etc.")


(defn solution
  [& args])


(assert (and (= (take 5 (solution (fn* [p1__4827#] (* 2 p1__4827#)) 1)) [1 2 4 8 16])
             (= (take 100 (solution inc 0)) (take 100 (range)))
             (= (take 9 (solution (fn* [p1__4828#] (inc (mod p1__4828# 3))) 1)) (take 9 (cycle [1 2 3])))))

(ns problems.medium.144)

(comment "Oscilrate")


(comment "Write an oscillating iterate: a function that takes
an initial value and a variable number of functions. It should return
a lazy sequence of the functions applied to the value in order, restarting
from the first function after it hits the end.")


(defn solution
  [& args])


(assert (and (= (take 3 (solution 3.14 int double)) [3.14 3 3.0])
             (= (take 5 (solution 3 (fn* [p1__4840#] (- p1__4840# 3)) (fn* [p1__4841#] (+ 5 p1__4841#)))) [3 0 5 2 7])
             (= (take 12 (solution 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3])))

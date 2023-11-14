(ns solved.035)

(comment "Local bindings")


(comment "Clojure lets you give local names
to values using the special let-form.")


(def solution 7)


(assert (and (= solution (let [x 5] (+ 2 x)))
             (= solution (let [x 3 y 10] (- y x)))
             (= solution (let [x 21] (let [y 3] (/ x y))))))

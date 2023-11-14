(ns problems.medium.121)

(comment "Universal Computation Engine")


(comment "Given a mathematical formula in prefix notation,
return a function that calculates the value of the formula.
The formula can contain nested calculations using
the four basic mathematical operators, numeric constants,
and symbols representing variables.
The returned function has to accept a single parameter
containing the map of variable names to their values.")


(defn solution
  [& args])


(assert (and (= 2 ((solution (quote (/ a b))) (quote {b 8, a 16})))
             (= 8 ((solution (quote (+ a b 2))) (quote {a 2, b 4})))
             (= [6 0 -4] (map (solution (quote (* (+ 2 a) (- 10 b)))) (quote [{a 1, b 8} {b 5, a -2} {a 2, b 11}])))
             (= 1 ((solution (quote (/ (+ x 2) (* 3 (+ y 1))))) (quote {x 4, y 1})))))

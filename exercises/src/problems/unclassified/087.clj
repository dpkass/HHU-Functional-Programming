(ns problems.unclassified.087)

(comment "Create an Equation")


(comment "Write a function which takes three or more integers.
Using these integers, your function should
generate clojure code representing an equation.
The following rules for the equation must be satisfied:

1. All integers must be used once and only once.

2. The order of the integers must be
   maintained when reading the equation left-to-right.

3. The only functions you may use are +, *, or =.

4. The equation must use the minimum number of parentheses.

5. If no satisfying equation exists, return nil.")


(defn solution
  [& args])


(assert (and (= (solution 3 4 7) (quote (= (+ 3 4) 7)))
             (= (solution 3 4 12) (quote (= (* 3 4) 12)))
             (= (solution 3 4 14) nil)
             (= (solution 3 4 5 35) (quote (= (* (+ 3 4) 5) 35)))
             (= (solution 3 4 5 60) (quote (= (+ (* 3 4) 5) 60)))
             (= (solution 3 4 5 23) (quote (= (+ 3 (* 4 5)) 23)))
             (= (solution 3 4 5 27) (quote (= (* 3 (+ 4 5)) 27)))
             (= (solution 3 4 5 6) nil)
             (= (solution 1 2 10 100 2001) (quote (= (+ 1 (* 2 10 100)) 2001)))
             (= (solution 1 2 10 100 1300) (quote (= (* (+ 1 2 10) 100) 1300)))))

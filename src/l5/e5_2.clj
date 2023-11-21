(ns l5.e5-2)

(comment "a) Write a function (defn newton [f f’] ...) that receives the function and its
derivative as a parameter. The call to newton should then return a function which in turn
receives a starting value x and a precision eps and approximates the solution for f (x) = 0 ± eps
 using Newton’s method.")

(defn diff [a b]
  (abs (- a b)))

(defn div [& args]
  (apply / (map double args)))

(defn newton [f f']
  (let [newton-series #(- % (div (f %) (f' %)))]
    (fn [guess eps]
      (loop [xn guess, xn+1 (newton-series xn)]
        (if (< (diff xn xn+1) eps)
          xn+1
          (recur xn+1 (newton-series xn+1)))))))



(defn is-close [a b]
  (< (diff a b) 1e-9))

(is-close ((newton #(* % %) #(* 2 %)) 1 1e-10) 0)      ;x^2
(is-close ((newton #(* % % %) #(* 3 (* % %))) -1 1e-10) 0) ; x^3
(is-close ((newton #(Math/pow (- % 2) 2) #(* 2 (- % 2))) 20 1e-10) 2) ; (x-2)^2
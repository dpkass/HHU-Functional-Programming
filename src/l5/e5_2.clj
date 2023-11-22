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



(defn is-close
  ([a b]
   (is-close a b 1e-9))
  ([a b abs-diff]
   (< (diff a b) abs-diff)))

(is-close ((newton #(* % %) #(* 2 %)) 1 1e-10) 0)           ;x^2
(is-close ((newton #(* % % %) #(* 3 (* % %))) -1 1e-10) 0)  ; x^3
(is-close ((newton #(- (* % %) 2) #(* 2 %)) 1 1e-5) (Math/sqrt 2) 1e-6) ;x^2-2
(is-close ((newton #(Math/pow (- % 2) 2) #(* 2 (- % 2))) 20 1e-5) 2 1e-6) ; (x-2)^2



(comment "b) The square root of a number K is a solution for the equation c2 − K = 0. So we can
apply Newton’s Method to the function f(x) = x2 − K. Write a function (defn sqrt [n] ...) which
approximates the square root of n using Newton’s method. You can use 10−5 as both initial value
and precision.")

(defn sqrt [n]
  ((newton #(- (* % %) n) #(* 2 %)) 1 1e-10))

(is-close (sqrt 0) 0)
(is-close (sqrt 1) 1)
(is-close (sqrt 2) (Math/sqrt 2))
(is-close (sqrt 4) 2)
(is-close (sqrt 9) 3)
(is-close (sqrt 1000000000000000000000000000000000000000000000000) 1000000000000000000000000)

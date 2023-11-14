(ns problems.medium.075)

(comment "Euler's Totient Function")


(comment "Two numbers are coprime if their
greatest common divisor equals 1.
Euler's totient function f(x) is defined as
the number of positive integers less than x which are coprime to x.
The special case f(1) equals 1.
Write a function which calculates Euler's totient function.")


(defn solution
  [& args])


(assert (and (= (solution 1) 1)
             (= (solution 10) (count (quote (1 3 7 9))) 4)
             (= (solution 40) 16)
             (= (solution 99) 60)))

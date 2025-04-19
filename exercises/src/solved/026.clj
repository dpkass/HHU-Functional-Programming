(ns solved.026)

(comment "Fibonacci Sequence")


(comment "Write a function which returns
the first X fibonacci numbers.")

; classic naive fib
(defn fib [n]
  (cond
    (= n 0) 0
    (= n 1) 1
    :else (+ (fib (dec n)) (fib (- n 2)))))

(defn solution [n]
  (map (comp fib inc) (range n)))


(assert (and (= (solution 3) (quote (1 1 2)))
             (= (solution 6) (quote (1 1 2 3 5 8)))
             (= (solution 8) (quote (1 1 2 3 5 8 13 21)))))

(ns problems.medium.116)

(comment "Prime Sandwich")


(comment "A balanced prime is a prime number which is
also the mean of the primes directly before
and after it in the sequence of valid primes.
Create a function which takes an integer n,
and returns true iff it is a balanced prime.")


(defn solution
  [& args])


(assert (and (= false (solution 4))
             (= true (solution 563))
             (= 1103 (nth (filter solution (range)) 15))))

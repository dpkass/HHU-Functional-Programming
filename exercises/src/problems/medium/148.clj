(ns problems.medium.148)

(comment "The Big Divide")


(comment "Write a function which calculates the sum of all natural
numbers under n (first argument) which are evenly divisible by at least one
of a and b (second and third argument). Numbers a and b are guaranteed to be coprimes.

Note: Some test cases have a very large n, so the most obvious solution will
exceed the time limit.")


(defn solution
  [& args])


(assert (and (= 0 (solution 3 17 11))
             (= 23 (solution 10 3 5))
             (= 233168 (solution 1000 3 5))
             (= "2333333316666668" (str (solution 100000000 3 5)))
             (= "110389610389889610389610" (str (solution (* 10000 10000 10000) 7 11)))
             (= "1277732511922987429116" (str (solution (* 10000 10000 10000) 757 809)))
             (= "4530161696788274281" (str (solution (* 10000 10000 1000) 1597 3571)))))

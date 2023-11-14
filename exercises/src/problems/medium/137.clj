(ns problems.medium.137)

(comment "Digits and bases")


(comment "Write a function which returns a sequence of digits
of a non-negative number (first argument)
in numerical system with an arbitrary base (second argument).
Digits should be represented with their integer values,
e.g. 15 would be [1 5] in base 10,
[1 1 1 1] in base 2 and [15] in base 16.")


(defn solution
  [& args])


(assert (and (= [1 2 3 4 5 0 1] (solution 1234501 10))
             (= [0] (solution 0 11))
             (= [1 0 0 1] (solution 9 2))
             (= [1 0] (let [n (rand-int 100000)] (solution n n)))
             (= [16 18 5 24 15 1] (solution Integer/MAX_VALUE 42))))

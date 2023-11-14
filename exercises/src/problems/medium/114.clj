(ns problems.medium.114)

(comment "Global take-while")


(comment "take-while is great for
filtering sequences, but it limited:
you can only examine a single item of the sequence at a time.
What if you need to keep track of
some state as you go over the sequence?

Write a function which accepts an integer n,
a predicate p, and a sequence.
It should return a lazy sequence of items in the list up to,
but not including, the nth item that satisfies the predicate.")


(defn solution
  [& args])


(assert (and (= [2 3 5 7 11 13] (solution 4 (fn* [p1__4836#] (= 2 (mod p1__4836# 3))) [2 3 5 7 11 13 17 19 23]))
             (= ["this" "is" "a" "sentence"] (solution 3 (fn* [p1__4837#] (some #{\i} p1__4837#)) ["this" "is" "a" "sentence" "i" "wrote"]))
             (= ["this" "is"] (solution 1 #{"a"} ["this" "is" "a" "sentence" "i" "wrote"]))))

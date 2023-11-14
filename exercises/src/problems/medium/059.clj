(ns problems.medium.059)

(comment "Juxtaposition")


(comment "Take a set of functions and return a new function
that takes a variable number of arguments and returns a sequence
containing the result of applying each function
left-to-right to the argument list.")


(defn solution
  [& args])


(assert (and (= [21 6 1] ((solution + max min) 2 3 5 1 6 4))
             (= ["HELLO" 5] ((solution (fn* [p1__4826#] (.toUpperCase p1__4826#)) count) "hello"))
             (= [2 6 4] ((solution :a :c :b) {:a 2, :b 4, :c 6, :d 8, :e 10}))))

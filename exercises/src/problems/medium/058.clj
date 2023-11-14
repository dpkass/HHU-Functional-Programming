(ns problems.medium.058)

(comment "Function Composition")


(comment "Write a function which
allows you to create function compositions.
The parameter list should take a variable number of functions,
and create a function applies them from right-to-left.")


(defn solution
  [& args])


(assert (and (= [3 2 1] ((solution rest reverse) [1 2 3 4]))
             (= 5 ((solution (partial + 3) second) [1 2 3 4]))
             (= true ((solution zero? (fn* [p1__4823#] (mod p1__4823# 8)) +) 3 5 7 9))
             (= "HELLO" ((solution (fn* [p1__4824#] (.toUpperCase p1__4824#)) (fn* [p1__4825#] (apply str p1__4825#)) take) 5 "hello world"))))

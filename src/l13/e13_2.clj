(ns l13.e13-2
  (:import (java.util Collection)))


(comment "Exercise 13.2 (Operator Overloading)
Define a new protocol Multipliable with a single function mult that takes two arguments. The
function mult shall dispatch on the type of the first argument and “multiply” it with the second
arguments. Calls and results may, for example, look like the following:

user=> (mult 3 4)
12

user=> (mult \"foo\" 4)
\"foofoofoofoo\"

user=> (mult ’(1 2 3) 4)
(1 2 3 1 2 3 1 2 3 1 2 3)

Implement the protocol for at least these three types.")


(defprotocol Multipliable
  (mult [v n]))

(extend-protocol Multipliable
  Long (mult [l n] (* l n))
  String (mult [s n] (apply str (repeat n s)))
  Collection (mult [l n] (apply concat (repeat n l))))

(mult 3 4)
(mult "foo" 4)
(mult '(1 2 3) 4)
(mult [1 2 3] 4)
(mult #{1 2 3} 4)
(ns problems.hard.125)

(comment "Gus' Quinundrum")


(comment "Create a function of no arguments
which returns a string that is
an exact copy of the function itself.

Hint: Read up on quines if you get stuck
(this question is harder than it first appears);
but it’s worth the effort to solve it independently if you can!

Fun fact: Gus is the name of the 4Clojure dragon.")


(defn solution
  [& args])


(assert (and (= (str (quote solution)) (solution))))

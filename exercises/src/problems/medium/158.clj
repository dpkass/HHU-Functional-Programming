(ns problems.medium.158)

(comment "Decurry")


(comment "Write a function that accepts a curried function of unknown arity n.
Return an equivalent function of n arguments. ")


(defn solution
  [& args])


(assert (and (= 10 ((solution (fn [a] (fn [b] (fn [c] (fn [d] (+ a b c d)))))) 1 2 3 4))
             (= 24 ((solution (fn [a] (fn [b] (fn [c] (fn [d] (* a b c d)))))) 1 2 3 4))
             (= 25 ((solution (fn [a] (fn [b] (* a b)))) 5 5))))

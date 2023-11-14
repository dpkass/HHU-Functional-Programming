(ns problems.easy.083)

(comment "A Half-Truth")


(comment "Write a function which takes
a variable number of booleans.
Your function should return true if
some of the parameters are true,
but not all of the parameters are true.
Otherwise your function should return false.")


(defn solution
  [& args])


(assert (and (= false (solution false false))
             (= true (solution true false))
             (= false (solution true))
             (= true (solution false true false))
             (= false (solution true true true))
             (= true (solution true true true false))))

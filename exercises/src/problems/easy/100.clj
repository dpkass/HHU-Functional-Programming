(ns problems.easy.100)

(comment "Least Common Multiple")


(comment "Write a function which calculates
the least common multiple.
Your function should accept a variable number
of positive integers or ratios.")


(defn solution
  [& args])


(assert (and (== (solution 2 3) 6)
             (== (solution 5 3 7) 105)
             (== (solution 1/3 2/5) 2)
             (== (solution 3/4 1/6) 3/2)
             (== (solution 7 5/7 2 3/5) 210)))

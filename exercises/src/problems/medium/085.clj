(ns problems.medium.085)

(comment "Power Set")


(comment "Write a function which generates the power set of a given set.
The power set of a set x is the set of all subsets of x,
including the empty set and x itself.")


(defn solution
  [& args])


(assert (and (= (solution #{1 :a}) #{#{1 :a} #{} #{1} #{:a}})
             (= (solution #{}) #{#{}})
             (= (solution #{1 3 2}) #{#{} #{3} #{2} #{1} #{1 3 2} #{1 3} #{1 2} #{3 2}})
             (= (count (solution (into #{} (range 10)))) 1024)))

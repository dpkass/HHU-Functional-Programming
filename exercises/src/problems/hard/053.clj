(ns problems.hard.053)

(comment "Longest Increasing Sub-Seq")


(comment "Given a vector of integers,
find the longest consecutive sub-sequence of increasing numbers.
If two sub-sequences have the same length,
use the one that occurs first.
An increasing sub-sequence must have
a length of 2 or greater to qualify.")


(defn solution
  [& args])


(assert (and (= (solution [1 0 1 2 3 0 4 5]) [0 1 2 3])
             (= (solution [5 6 1 3 2 7]) [5 6])
             (= (solution [2 3 3 4 5]) [3 4 5])
             (= (solution [7 6 5 4]) [])))

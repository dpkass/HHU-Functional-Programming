(ns problems.medium.070)

(comment "Word Sorting")


(comment "Write a function which splits a sentence up
into a sorted list of words.
Capitalization should not affect sort order
and punctuation should be ignored.")


(defn solution
  [& args])


(assert (and (= (solution "Have a nice day.") ["a" "day" "Have" "nice"])
             (= (solution "Clojure is a fun language!") ["a" "Clojure" "fun" "is" "language"])
             (= (solution "Fools fall for foolish follies.") ["fall" "follies" "foolish" "Fools" "for"])))

(ns problems.hard.082)

(comment "Word Chains")


(comment "A word chain consists of
a set of words ordered so that each word differs
by only one letter from the words directly before and after it.
The one letter difference can be either an insertion,
a deletion, or a substitution.

Here is an example word chain:

cat -> cot -> coat -> oat -> hat -> hot -> hog -> dog

Write a function which takes a sequence of words,
and returns true if they can be
arranged into one continous word chain,
and false if they cannot.")


(defn solution
  [& args])


(assert (and (= true (solution #{"dog" "oat" "cot" "coat" "hot" "hat" "hog" "cat"}))
             (= false (solution #{"cot" "hot" "bat" "fat"}))
             (= false (solution #{"stop" "top" "tops" "toss" "to"}))
             (= true (solution #{"spot" "pot" "spout" "dot" "pout" "do"}))
             (= true (solution #{"shares" "are" "hare" "hares" "share"}))
             (= false (solution #{"are" "hare" "hares" "share"}))))

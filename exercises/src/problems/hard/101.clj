(ns problems.hard.101)

(comment "Levenshtein Distance")


(comment "Given two sequences x and y,
calculate the Levenshtein distance of x and y,
i. e. the minimum number of edits needed to transform x into y.
The allowed edits are:

- insert a single item
- delete a single item
- replace a single item with another item

WARNING: Some of the test cases may timeout
if you write an inefficient solution!")


(defn solution
  [& args])


(assert (and (= (solution "kitten" "sitting") 3)
             (= (solution "closure" "clojure") (solution "clojure" "closure") 1)
             (= (solution "xyx" "xyyyx") 2)
             (= (solution "" "123456") 6)
             (= (solution "Clojure" "Clojure") (solution "" "") (solution [] []) 0)
             (= (solution [1 2 3 4] [0 2 3 4 5]) 2)
             (= (solution (quote (:a :b :c :d)) (quote (:a :d))) 2)
             (= (solution "ttttattttctg" "tcaaccctaccat") 10)
             (= (solution "gaattctaatctc" "caaacaaaaaattt") 9)))

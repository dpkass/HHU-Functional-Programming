(ns problems.medium.055)

(comment "Count Occurences")


(comment "Write a function which returns a map
containing the number of occurences
of each distinct item in a sequence.")


(defn solution
  [& args])


(assert (and (= (solution [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
             (= (solution [:b :a :b :a :b]) {:a 2, :b 3})
             (= (solution (quote ([1 2] [1 3] [1 3]))) {[1 2] 1, [1 3] 2})))

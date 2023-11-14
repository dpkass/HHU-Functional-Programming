(ns problems.medium.056)

(comment "Find Distinct Items")


(comment "Write a function which
removes the duplicates from a sequence.
Order of the items must be maintained.")


(defn solution
  [& args])


(assert (and (= (solution [1 2 1 3 1 2 4]) [1 2 3 4])
             (= (solution [:a :a :b :b :c :c]) [:a :b :c])
             (= (solution (quote ([2 4] [1 2] [1 3] [1 3]))) (quote ([2 4] [1 2] [1 3])))
             (= (solution (range 50)) (range 50))))

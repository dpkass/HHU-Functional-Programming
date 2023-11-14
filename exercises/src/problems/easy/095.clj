(ns problems.easy.095)

(comment "To Tree, or not to Tree")


(comment "Write a predicate which checks whether or not
a given sequence represents a binary tree.
Each node in the tree must have a value,
a left child, and a right child.")


(defn solution
  [& args])


(assert (and (= (solution (quote (:a (:b nil nil) nil))) true)
             (= (solution (quote (:a (:b nil nil)))) false)
             (= (solution [1 nil [2 [3 nil nil] [4 nil nil]]]) true)
             (= (solution [1 [2 nil nil] [3 nil nil] [4 nil nil]]) false)
             (= (solution [1 [2 [3 [4 nil nil] nil] nil] nil]) true)
             (= (solution [1 [2 [3 [4 false nil] nil] nil] nil]) false)
             (= (solution (quote (:a nil ()))) false)))

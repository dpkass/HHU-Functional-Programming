(ns problems.easy.096)

(comment "Beauty is Symmetry")


(comment "Let us define a binary tree as "symmetric"
if the left half of the tree is
the mirror image of the right half of the tree.
Write a predicate to determine whether or not
a given binary tree is symmetric.
(see To Tree, or not to Tree for a reminder on
the tree representation we're using).")


(defn solution
  [& args])


(assert (and (= (solution (quote (:a (:b nil nil) (:b nil nil)))) true)
             (= (solution (quote (:a (:b nil nil) nil))) false)
             (= (solution (quote (:a (:b nil nil) (:c nil nil)))) false)
             (= (solution [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]] [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]]) true)
             (= (solution [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]] [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]]) false)
             (= (solution [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]] [2 [3 nil [4 [6 nil nil] nil]] nil]]) false)))

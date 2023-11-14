(ns problems.easy.081)

(comment "Set Intersection")


(comment "Write a function which returns
the intersection of two sets.
The intersection is the sub-set of items
that each set has in common.")


(defn solution
  [& args])


(assert (and (= (solution #{0 1 3 2} #{4 3 2 5}) #{3 2})
             (= (solution #{0 1 2} #{4 3 5}) #{})
             (= (solution #{:c :b :d :a} #{:e :c :d :f :a}) #{:c :d :a})))

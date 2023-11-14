(ns problems.easy.088)

(comment "Symmetric Difference")


(comment "Write a function which returns
the symmetric difference of two sets.
The symmetric difference is the set of items
belonging to one but not both of the two sets.")


(defn solution
  [& args])


(assert (and (= (solution #{1 4 6 3 2 5} #{7 1 3 5}) #{7 4 6 2})
             (= (solution #{:c :b :a} #{}) #{:c :b :a})
             (= (solution #{} #{4 6 5}) #{4 6 5})
             (= (solution #{[2 3] [1 2]} #{[2 3] [3 4]}) #{[3 4] [1 2]})))

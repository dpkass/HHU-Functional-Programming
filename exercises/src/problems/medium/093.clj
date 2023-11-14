(ns problems.medium.093)

(comment "Partially Flatten a Sequence")


(comment "Write a function which
flattens any nested combination of sequential things
(lists, vectors, etc.),
but maintains the lowest level sequential items.
The result should be a sequence of sequences
with only one level of nesting.")


(defn solution
  [& args])


(assert (and (= (solution [["Do"] ["Nothing"]]) [["Do"] ["Nothing"]])
             (= (solution [[[[:a :b]]] [[:c :d]] [:e :f]]) [[:a :b] [:c :d] [:e :f]])
             (= (solution (quote ((1 2) ((3 4) ((((5 6)))))))) (quote ((1 2) (3 4) (5 6))))))

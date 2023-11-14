(ns problems.medium.050)

(comment "Split by Type")


(comment "Write a function which takes
a sequence consisting of items with different types
and splits them up into a set of homogeneous sub-sequences.
The internal order of each sub-sequence should be maintained,
but the sub-sequences themselves can be returned in any order
(this is why 'set' is used in the test cases).")


(defn solution
  [& args])


(assert (and (= (set (solution [1 :a 2 :b 3 :c])) #{[:a :b :c] [1 2 3]})
             (= (set (solution [:a "foo" "bar" :b])) #{[:a :b] ["foo" "bar"]})
             (= (set (solution [[1 2] :a [3 4] 5 6 :b])) #{[:a :b] [[1 2] [3 4]] [5 6]})))

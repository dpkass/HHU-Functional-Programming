(ns problems.medium.103)

(comment "Generating k-combinations")


(comment "Given a sequence S consisting of n elements
generate all k-combinations of S,
i.e. generate all possible sets consisting
of k distinct elements taken from S.
The number of k-combinations for a sequence
is equal to the binomial coefficient.")


(defn solution
  [& args])


(assert (and (= (solution 1 #{4 6 5}) #{#{6} #{5} #{4}})
             (= (solution 10 #{4 6 5}) #{})
             (= (solution 2 #{0 1 2}) #{#{0 1} #{1 2} #{0 2}})
             (= (solution 3 #{0 1 4 3 2}) #{#{0 4 3} #{0 1 4} #{4 3 2} #{0 1 2} #{0 1 3} #{1 3 2} #{0 3 2} #{1 4 3} #{1 4 2} #{0 4 2}})
             (= (solution 4 #{"efg" "abc" [1 2 3] :a}) #{#{"efg" "abc" [1 2 3] :a}})
             (= (solution 2 #{"efg" "abc" [1 2 3] :a}) #{#{[1 2 3] :a} #{"efg" :a} #{"abc" :a} #{"abc" [1 2 3]} #{"efg" "abc"} #{"efg" [1 2 3]}})))

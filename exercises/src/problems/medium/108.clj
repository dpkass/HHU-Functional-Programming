(ns problems.medium.108)

(comment "Lazy Searching")


(comment "Given any number of sequences,
each sorted from smallest to largest,
find the smallest single number
which appears in all of the sequences.
The sequences may be infinite, so be careful to search lazily.")


(defn solution
  [& args])


(assert (and (= 3 (solution [3 4 5]))
             (= 4 (solution [1 2 3 4 5 6 7] [0.5 3/2 4 19]))
             (= 64 (solution (map (fn* [p1__4834#] (* p1__4834# p1__4834# p1__4834#)) (range)) (filter (fn* [p1__4835#] (zero? (bit-and p1__4835# (dec p1__4835#)))) (range)) (iterate inc 20)))
             (= 7 (solution (range) (range 0 100 7/6) [2 3 5 7 11 13]))))

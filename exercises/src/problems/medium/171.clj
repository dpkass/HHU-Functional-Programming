(ns problems.medium.171)

(comment "Intervals")


(comment "Write a function that takes a sequence of integers
and returns a sequence of “intervals”.
Each interval is a a vector of two integers, start and end,
such that all integers between start and end (inclusive)
are contained in the input sequence.")


(defn solution
  [& args])


(assert (and (= (solution [1 2 3]) [[1 3]])
             (= (solution [10 9 8 1 2 3]) [[1 3] [8 10]])
             (= (solution [1 1 1 1 1 1 1]) [[1 1]])
             (= (solution []) [])
             (= (solution [19 4 17 1 3 10 2 13 13 2 16 4 2 15 13 9 6 14 2 11]) [[1 4] [6 6] [9 11] [13 17] [19 19]])))

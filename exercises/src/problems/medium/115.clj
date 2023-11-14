(ns problems.medium.115)

(comment "The Balance of N")


(comment "A balanced number is one whose component digits
have the same sum on the left and right halves of the number.
Write a function which accepts an integer n,
and returns true iff n is balanced.")


(defn solution
  [& args])


(assert (and (= true (solution 11))
             (= true (solution 121))
             (= false (solution 123))
             (= true (solution 0))
             (= false (solution 88099))
             (= true (solution 89098))
             (= true (solution 89089))
             (= (take 20 (filter solution (range))) [0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101])))

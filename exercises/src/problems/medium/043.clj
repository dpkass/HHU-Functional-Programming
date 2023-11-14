(ns problems.medium.043)

(comment "Reverse Interleave")


(comment "Write a function which reverses the
interleave process into x number of subsequences.")


(defn solution
  [& args])


(assert (and (= (solution [1 2 3 4 5 6] 2) (quote ((1 3 5) (2 4 6))))
             (= (solution (range 9) 3) (quote ((0 3 6) (1 4 7) (2 5 8))))
             (= (solution (range 10) 5) (quote ((0 5) (1 6) (2 7) (3 8) (4 9))))))

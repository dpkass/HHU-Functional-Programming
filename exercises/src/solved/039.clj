(ns problems.easy.039)

(comment "Interleave Two Seqs")


(comment "Write a function which takes two sequences
and returns the first item from each,
then the second item from each, then the third, etc.")


(defn solution
  [& args])


(assert (and (= (solution [1 2 3] [:a :b :c]) (quote (1 :a 2 :b 3 :c)))
             (= (solution [1 2] [3 4 5 6]) (quote (1 3 2 4)))
             (= (solution [1 2 3 4] [5]) [1 5])
             (= (solution [30 20] [25 15]) [30 25 20 15])))

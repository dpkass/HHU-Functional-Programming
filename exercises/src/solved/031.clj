(ns solved.031)

(comment "Pack a Sequence")


(comment "Write a function which
packs consecutive duplicates into sub-lists.")

(defn llast [col] (peek (peek col)))                        ; is only llast for vectors

(defn solution [col]
  (reduce
    (fn [acc curr]
        (if (= (llast acc) curr)
          (conj (pop acc) (conj (last acc) curr))
          (conj acc [curr])))
    []
    col))
; too many unnecessary calculations. keep removing lists etc.
; maybe just counting is better and then use repeat...

(assert (and (= (solution [1 1 2 1 1 1 3 3]) (quote ((1 1) (2) (1 1 1) (3 3))))
             (= (solution [:a :a :b :b :c]) (quote ((:a :a) (:b :b) (:c))))
             (= (solution [[1 2] [1 2] [3 4]]) (quote (([1 2] [1 2]) ([3 4]))))))

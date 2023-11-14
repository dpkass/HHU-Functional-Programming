(ns solved.030)

(comment "Compress a Sequence")


(comment "Write a function which removes
consecutive duplicates from a sequence.")


(defn solution [col]
  (reduce
    (fn [acc curr]
      (if (= (last acc) curr)
        acc
        (conj acc curr)))
    []
    col))

(assert (and (= (apply str (solution "Leeeeeerrroyyy")) "Leroy")
             (= (solution [1 1 2 3 3 2 2 3]) (quote (1 2 3 2 3)))
             (= (solution [[1 2] [1 2] [3 4] [1 2]]) (quote ([1 2] [3 4] [1 2])))))

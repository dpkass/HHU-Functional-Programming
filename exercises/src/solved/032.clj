(ns solved.032)

(comment "Duplicate a Sequence")


(comment "Write a function which
duplicates each element of a sequence.")


;(defn solution [col]
;  (flatten (map (fn [x] [x x]) col)))
; doesn't quite work, since flatten goes too deep

(defn solution [col]
  (mapcat (fn [x] [x x]) col))


(assert (and (= (solution [1 2 3]) (quote (1 1 2 2 3 3)))
             (= (solution [:a :a :b :b]) (quote (:a :a :a :a :b :b :b :b)))
             (= (solution [[1 2] [3 4]]) (quote ([1 2] [1 2] [3 4] [3 4])))
             (= (solution [44 33]) [44 44 33 33])))

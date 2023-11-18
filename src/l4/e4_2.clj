(ns l4.e4-2)

(def identity-matrix [[1 0 0] [0 1 0] [0 0 1]])
(def matrix2 [[1 0 0 1] [0 1 0 1] [0 0 1 1]])



(comment "a)")

(defn p_row! [row]
  (doseq [cell row]
    (print cell))
  (println))

(defn p! [mat]
  (doseq [row mat] (p_row! row)))

(p! identity-matrix)
(p! matrix2)

; Alternative, use string concat
(defn p! [mat]
  (doseq [row mat]
    (println (clojure.string/join row))))

(p! identity-matrix)
(p! matrix2)



(comment "b)")

(defn get_col [mat index]
  (reduce
    (fn [acc row]
      (conj acc (nth row index)))
    []
    mat))

(defn trans [mat]
  (let [cols (count (first mat))]
    (for [i (range cols)]
      (get_col mat i))))

(assert (and (= identity-matrix (trans identity-matrix))
             (not= matrix2 (trans matrix2))))
(p! (trans identity-matrix))
(p! (trans matrix2))


; Proposed Alternative (not my idea)

(defn trans [mat]
  (map #(mapv nth % mat) (range (count (first mat)))))

(assert (and (= identity-matrix (trans identity-matrix))
             (not= matrix2 (trans matrix2))))
(p! (trans identity-matrix))
(p! (trans matrix2))


; Found upon reading mapv docs

(defn trans [mat]
  (apply mapv vector mat))

(assert (and (= identity-matrix (trans identity-matrix))
             (not= matrix2 (trans matrix2))))
(p! (trans identity-matrix))
(p! (trans matrix2))

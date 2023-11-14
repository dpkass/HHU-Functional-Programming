(ns solved.015)

(comment "Double Down")

(comment "Write a function which doubles a number.")


(defn solution [& args] (* 2 (first args)))


(assert (and (= (solution 2) 4)
             (= (solution 3) 6)
             (= (solution 11) 22)
             (= (solution 7) 14)))

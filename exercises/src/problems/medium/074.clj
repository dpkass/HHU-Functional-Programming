(ns problems.medium.074)

(comment "Filter Perfect Squares")


(comment "Given a string of comma separated integers,
write a function which returns a new comma separated string
that only contains the numbers which are perfect squares.")


(defn solution
  [& args])


(assert (and (= (solution "4,5,6,7,8,9") "4,9")
             (= (solution "15,16,25,36,37") "16,25,36")))

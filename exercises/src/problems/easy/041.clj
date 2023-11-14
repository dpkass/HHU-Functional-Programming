(ns problems.easy.041)

(comment "Drop Every Nth Item")


(comment "Write a function which
drops every Nth item from a sequence.")


(defn solution
  [& args])


(assert (and (= (solution [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
             (= (solution [:a :b :c :d :e :f] 2) [:a :c :e])
             (= (solution [1 2 3 4 5 6] 4) [1 2 3 5 6])))

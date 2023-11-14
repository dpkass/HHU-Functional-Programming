(ns problems.easy.040)

(comment "Interpose a Seq")


(comment "Write a function which separates
the items of a sequence by an arbitrary value.")


(defn solution
  [& args])


(assert (and (= (solution 0 [1 2 3]) [1 0 2 0 3])
             (= (apply str (solution ", " ["one" "two" "three"])) "one, two, three")
             (= (solution :z [:a :b :c :d]) [:a :z :b :z :c :z :d])))

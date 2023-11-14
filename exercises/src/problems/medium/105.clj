(ns problems.medium.105)

(comment "Identify keys and values")


(comment "Given an input sequence of keywords and numbers,
create a map such that each key in the map is a keyword,
and the value is a sequence of all the numbers (if any)
between it and the next keyword in the sequence.")


(defn solution
  [& args])


(assert (and (= {} (solution []))
             (= {:a [1]} (solution [:a 1]))
             (= {:a [1], :b [2]} (solution [:a 1 :b 2]))
             (= {:a [1 2 3], :b [], :c [4]} (solution [:a 1 2 3 :b :c 4]))))

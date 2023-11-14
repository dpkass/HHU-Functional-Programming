(ns problems.easy.118)

(comment "Re-implement Map")


(comment "Map is one of the core elements
of a functional programming language.
Given a function f and an input sequence s,
return a lazy sequence of (f x) for each element x in s.")


(defn solution
  [& args])


(assert (and (= [3 4 5 6 7] (solution inc [2 3 4 5 6]))
             (= (repeat 10 nil) (solution (fn [_] nil) (range 10)))
             (= [1000000 1000001] (->> (solution inc (range)) (drop (dec 1000000)) (take 2)))
             (= [1000000 1000001] (->> (solution inc (range)) (drop (dec 1000000)) (take 2)))))

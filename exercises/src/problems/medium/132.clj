(ns problems.medium.132)

(comment "Intervals")


(comment "Write a function that takes a two-argument predicate,
a value, and a collection; and returns a new collection where the value
is inserted between every two items that satisfy the predicate.")


(defn solution
  [& args])


(assert (and (= (quote (1 :less 6 :less 7 4 3)) (solution < :less [1 6 7 4 3]))
             (= (quote (2)) (solution > :more [2]))
             (= [0 1 :x 2 :x 3 :x 4] (solution (fn* [p1__4838# p2__4839#] (and (pos? p1__4838#) (< p1__4838# p2__4839#))) :x (range 5)))
             (empty? (solution > :more ()))
             (= [0 1 :same 1 2 3 :same 5 8 13 :same 21] (take 12 (->> [0 1] (iterate (fn [[a b]] [b (+ a b)])) (map first) (solution (fn [a b] (= (mod a 2) (mod b 2))) :same))))))

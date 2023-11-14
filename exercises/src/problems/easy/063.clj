(ns problems.easy.063)

(comment "Group a Sequence")


(comment "Given a function f and a sequence s,
write a function which returns a map.
The keys should be the values of f applied to each item in s.
The value at each key should be a vector
of corresponding items in the order they appear in s.")


(defn solution
  [& args])


(assert (and (= (solution (fn* [p1__4829#] (> p1__4829# 5)) #{1 6 3 8}) {false [1 3], true [6 8]})
             (= (solution (fn* [p1__4830#] (apply / p1__4830#)) [[1 2] [2 4] [4 6] [3 6]]) {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})
             (= (solution count [[1] [1 2] [3] [1 2 3] [2 3]]) {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})))

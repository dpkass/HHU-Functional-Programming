(ns problems.hard.106)

(comment "Number Maze")


(comment "Given a pair of numbers, the start and end point,
find a path between the two using only three possible operations:

1. double
2. halve (odd numbers cannot be halved)
3. add 2

Find the shortest path through the “maze”.
Because there are multiple shortest paths,
you must return the length of the shortest path, not the path itself.")


(defn solution
  [& args])


(assert (and (= 1 (solution 1 1))
             (= 3 (solution 3 12))
             (= 3 (solution 12 3))
             (= 3 (solution 5 9))
             (= 9 (solution 9 2))
             (= 5 (solution 9 12))))

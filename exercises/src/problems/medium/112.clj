(ns problems.medium.112)

(comment "Sequs Horribilis")


(comment "Create a function which takes
an integer and a nested collection of integers as arguments.
Analyze the elements of the input collection
and return a sequence which maintains the nested structure,
and which includes all elements starting from
the head whose sum is less than or equal to the input integer.")


(defn solution
  [& args])


(assert (and (= (solution 10 [1 2 [3 [4 5] 6] 7]) (quote (1 2 (3 (4)))))
             (= (solution 30 [1 2 [3 [4 [5 [6 [7 8]] 9]] 10] 11]) (quote (1 2 (3 (4 (5 (6 (7))))))))
             (= (solution 9 (range)) (quote (0 1 2 3)))
             (= (solution 1 [[[[[1]]]]]) (quote (((((1)))))))
             (= (solution 0 [1 2 [3 [4 5] 6] 7]) (quote ()))
             (= (solution 0 [0 0 [0 [0]]]) (quote (0 0 (0 (0)))))
             (= (solution 1 [-10 [1 [2 3 [4 5 [6 7 [8]]]]]]) (quote (-10 (1 (2 3 (4))))))))

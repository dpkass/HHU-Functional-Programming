(ns problems.easy.090)

(comment "Cartesian Product")


(comment "Write a function which calculates
the Cartesian product of two sets.")


(defn solution
  [& args])


(assert (and (= (solution #{"queen" "king" "ace"} #{"♣" "♠" "♥" "♦"}) #{["ace" "♠"] ["queen" "♠"] ["ace" "♥"] ["ace" "♦"] ["king" "♣"] ["queen" "♣"] ["queen" "♥"] ["king" "♦"] ["ace" "♣"] ["queen" "♦"] ["king" "♥"] ["king" "♠"]})
             (= (solution #{1 3 2} #{4 5}) #{[2 5] [3 4] [1 4] [1 5] [2 4] [3 5]})
             (= 300 (count (solution (into #{} (range 10)) (into #{} (range 30)))))))

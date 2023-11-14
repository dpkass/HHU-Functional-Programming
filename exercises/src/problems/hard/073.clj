(ns problems.hard.073)

(comment "Analyze a Tic-Tac-Toe Board")


(comment "A tic-tac-toe board is represented by
a two dimensional vector.
X is represented by :x, O is represented by :o,
and empty is represented by :e.
A player wins by placing three Xs or three Os
in a horizontal, vertical, or diagonal row.
Write a function which analyzes a tic-tac-toe board
and returns :x if X has won, :o if O has won,
and nil if neither player has won.")


(defn solution
  [& args])


(assert (and (= nil (solution [[:e :e :e] [:e :e :e] [:e :e :e]]))
             (= :x (solution [[:x :e :o] [:x :e :e] [:x :e :o]]))
             (= :o (solution [[:e :x :e] [:o :o :o] [:x :e :x]]))
             (= nil (solution [[:x :e :o] [:x :x :e] [:o :x :o]]))
             (= :x (solution [[:x :e :e] [:o :x :e] [:o :e :x]]))
             (= :o (solution [[:x :e :o] [:x :o :e] [:o :e :x]]))
             (= nil (solution [[:x :o :x] [:x :o :x] [:o :x :o]]))))

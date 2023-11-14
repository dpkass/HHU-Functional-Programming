(ns solved.045)

(comment "Intro to Iterate")


(comment "The iterate function can be used to produce
an infinite lazy sequence.")


(def solution '(1 4 7 10 13))

(assert (and (= solution (take 5 (iterate (fn* [p1__4821#] (+ 3 p1__4821#)) 1)))))

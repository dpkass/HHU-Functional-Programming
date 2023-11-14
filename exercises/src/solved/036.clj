(ns solved.036)

(comment "Let it Be")

(comment "Can you bind x, y, and z so that these are all true?")


;; solution should be the same in all three instances
(assert (and (= 10 (let [x 7 y 3 z 1] (+ x y)))
             (= 4 (let [x 7 y 3 z 1] (+ y z)))
             (= 1 (let [x 7 y 3 z 1] z))))

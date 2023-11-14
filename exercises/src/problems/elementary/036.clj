(ns problems.elementary.036)

(comment "Let it Be")

(comment "Can you bind x, y, and z so that these are all true?")

;; solution should be the same in all three instances
(assert (and (= 10 (let solution (+ x y)))
             (= 4 (let solution (+ y z)))
             (= 1 (let solution z))))

(ns problems.easy.051)

(comment "Advanced Destructuring")


(comment "Here is an example of some
more sophisticated destructuring.")


(def solution nil)

(assert (and (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] solution] [a b c d]))))

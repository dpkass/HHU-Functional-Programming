(ns problems.easy.126)

(comment "Through the Looking Class")

(comment "Enter a value which satisfies the following:")

(def solution nil)

(assert (and (let [x solution] (and (= (class x) x) x))))

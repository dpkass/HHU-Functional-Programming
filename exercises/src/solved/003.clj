(ns solved.003)

(comment "Strings")


(comment "Clojure strings are Java strings,
so you can use Java string methods on them.")


(def solution "HELLO WORLD")

(assert (and (= solution (.toUpperCase "hello world"))))

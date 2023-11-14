(ns solved.037)

(comment "Regular Expressions")

(comment "Regex patterns are supported with a special reader macro.")

(def solution "ABC")

(assert (and (= solution (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))))

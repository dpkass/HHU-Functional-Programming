(ns solved.016)

(comment "Hello World")

(comment "Write a function which returns a personalized greeting.")


(defn solution
  [& args] (str "Hello, " (first args) "!"))

(solution ["abc"])

(assert (and (= (solution "Dave") "Hello, Dave!")
             (= (solution "Jenn") "Hello, Jenn!")
             (= (solution "Rhea") "Hello, Rhea!")))

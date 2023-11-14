(ns problems.easy.029)

(comment "Get the Caps")


(comment "Write a function which takes a string
and returns a new string containing only the capital letters.")


(defn solution
  [& args])


(assert (and (= (solution "HeLlO, WoRlD!") "HLOWRD")
             (empty? (solution "nothing"))
             (= (solution "$#A(*&987Zf") "AZ")))

(ns problems.hard.084)

(comment "Transitive Closure")


(comment "Write a function which generates
the transitive closure of a binary relation.
The relation will be represented as a set of 2 item vectors.")


(defn solution
  [& args])


(assert (and (let [divides #{[27 9] [8 4] [4 2] [9 3]}] (= (solution divides) #{[27 9] [27 3] [8 4] [4 2] [9 3] [8 2]}))
             (let [more-legs #{["man" "snake"] ["cat" "man"] ["spider" "cat"]}] (= (solution more-legs) #{["man" "snake"] ["spider" "man"] ["cat" "man"] ["cat" "snake"] ["spider" "snake"] ["spider" "cat"]}))
             (let [progeny #{["son" "grandson"] ["uncle" "cousin"] ["father" "son"]}] (= (solution progeny) #{["son" "grandson"] ["uncle" "cousin"] ["father" "son"] ["father" "grandson"]}))))

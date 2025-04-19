(ns problems.easy.173)

(comment "Intro to Destructuring 2")


(comment "Sequential destructuring allows you to bind symbols to parts of
sequential things (vectors, lists, seqs, etc.): (let [bindings* ] exprs*) Complete
the bindings so all let-parts evaluate to 3.")


(defn solution
  [& args])


(assert (and (= 3 (let [[solution] [+ (range 3)]] (apply solution)) (let [[[solution] b] [[+ 1] 2]] (solution b)) (let [[solution] [inc 2]] (solution)))))

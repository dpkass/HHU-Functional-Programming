(ns l8.e8-1)

; same as last week just using syntax quote
(comment "a) Write a macro that implements a simple calculator with infix notation. The first
argument should be a vector with bindings of symbols to values. Parentheses and operator
precedences need not be considered. The macro should work as follows:
    user=> (calc [a 3] 3 + 5 * a)
    24
    user=> (calc [b 5 a 3] a * b + 3)
    18
")

(defmacro calc [bindings & term]
  `(let ~bindings
     ~(loop [terms term]
        (if (= (count terms) 1)
          (first terms)
          (let [[acc op val & rest] terms]
            (recur (conj rest (list op acc val))))))))

(calc [a 3] a)
(calc [a 3] 3 + 5 * a)
(calc [b 5 a 3] a * b + 3)
(macroexpand '(calc [a 3] a))
(macroexpand '(calc [a 3] 3 + 5 * a))
(macroexpand '(calc [b 5 a 3] a * b + 3))

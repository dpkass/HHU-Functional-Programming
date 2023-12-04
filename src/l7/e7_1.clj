(ns l7.e7-1)

(comment "a) Write a macro that implements a simple calculator with infix notation. The first
argument should be a vector with bindings of symbols to values. Parentheses and operator
precedences need not be considered. The macro should work as follows:
    user=> (calc [a 3] 3 + 5 * a)
    24
    user=> (calc [b 5 a 3] a * b + 3)
    18
")

(defmacro calc [bindings & calcs]
  (list 'let (vec bindings)
        (loop [calcs calcs]
          (if (> (count calcs) 1)
            (let [[acc op val & rest] calcs]
              (recur (conj rest (list op acc val))))
            (first calcs)
            ))))

(calc [a 3] 3 + 5 * a)
(calc [b 5 a 3] a * b - 3)
(macroexpand '(calc [a 3] 3 + 5 * a))
(macroexpand '(calc [b 5 a 3] a * b - 3))

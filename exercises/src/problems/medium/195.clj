(ns problems.medium.195)

(comment "Parentheses... Again")


(comment "In a family of languages like Lisp, having balanced parentheses
is a defining feature of the language. Luckily, Lisp has almost no syntax, except
for these "delimiters" -- and that hardly qualifies as "syntax", at least in any
useful computer programming sense.

It is not a difficult exercise to find all the combinations of well-formed parentheses
if we only have N pairs to work with. For instance, if we only have 2 pairs, we only
have two possible combinations: "()()" and "(())". Any other combination of length 4
is ill-formed. Can you see why?

Generate all possible combinations of well-formed parentheses of length 2n (n pairs
of parentheses). For this problem, we only consider '(' and ')', but the answer
is similar if you work with only {} or only [].

There is an interesting pattern in the numbers!")


(defn solution
  [& args])


(assert (and (= [#{""} #{"()"} #{"(())" "()()"}] (map (fn [n] (solution n)) [0 1 2]))
             (= #{"(()())" "((()))" "()()()" "()(())" "(())()"} (solution 3))
             (= 16796 (count (solution 10)))
             (= (nth (sort (filter (fn* [p1__4864#] (.contains p1__4864# "(()()()())")) (solution 9))) 6) "(((()()()())(())))")
             (= (nth (sort (solution 12)) 5000) "(((((()()()()()))))(()))")))

(ns l7.e7-2)

(comment "Your task is to develop a simple DSL for DFAs. The automaton that recognizes binary
numbers divisible by five will serve as example. The states in the automaton are labeled
according to the residue class modulo 5, so z0 represents all numbers divisible by 5, z3 all
numbers whose remainder is 3, etc. The DSL should look as follows (i.e., this exact code is
expected to work without any modification! It may only be executed once, so once you have a
solution, re-start your REPL to ensure you do not have any left-over state.

  (declare z0 z1 z2 z3 z4)
  (def z0 (dfa-state :accept {\0 z0 \1 z1}))
  (def z1 (dfa-state :reject {\0 z2 \1 z3}))
  (def z2 (dfa-state :reject {\0 z4 \1 z0}))
  (def z3 (dfa-state :reject {\0 z1 \1 z2}))
  (def z4 (dfa-state :reject {\0 z3 \1 z4}))

Nota bene: You have to use the code snippet above verbatim! No modifications are
allowed. (dfa-state ... ) should return a function, which receives a string, consisting of 0s
and 1s, as parameter and returns :accept, if the string starting from this node results in an
accepting state. Otherwise :reject should be returned. (dfa-match init text) should serve as
entry point, which, starting from init, processes the input text.")

(defmacro dfa-state [status goto-map]
  (list 'fn ['input]
        (list 'if (list 'empty? 'input)
              status
              (list 'let (vector ['x '& 'rest] 'input)
                    (list (list 'get goto-map 'x) 'rest)))))

(defn dfa-match [state input]
  (state input))

(declare z0 z1 z2 z3 z4)
(def z0 (dfa-state :accept {\0 z0 \1 z1}))
(def z1 (dfa-state :reject {\0 z2 \1 z3}))
(def z2 (dfa-state :reject {\0 z4 \1 z0}))
(def z3 (dfa-state :reject {\0 z1 \1 z2}))
(def z4 (dfa-state :reject {\0 z3 \1 z4}))

(dfa-match z0 "")
(dfa-match z0 "010100010")
(dfa-match z0 "0101000101")

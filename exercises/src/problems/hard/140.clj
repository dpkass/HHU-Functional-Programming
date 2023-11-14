(ns problems.hard.140)

(comment "Veitch, Please!")


(comment "Create a function which accepts as input
a boolean algebra function in the form of a set of sets,
where the inner sets are collections of symbols corresponding
to the input boolean variables which satisfy the function
(the inputs of the inner sets are conjoint,
and the sets themselves are disjoint…
also known as canonical minterms).
Note: capitalized symbols represent truth,
and lower-case symbols represent negation of the inputs.
Your function must return the minimal function
which is logically equivalent to the input.

PS — You may want to read about K-Maps before proceeding.")


(defn solution
  [& args])


(assert (and (= (solution #{#{(quote A) (quote B) (quote C) (quote d)} #{(quote B) (quote C) (quote a) (quote d)} #{(quote A) (quote B) (quote c) (quote d)} #{(quote A) (quote C) (quote b) (quote d)} #{(quote A) (quote C) (quote b) (quote D)} #{(quote A) (quote b) (quote c) (quote d)} #{(quote A) (quote b) (quote c) (quote D)} #{(quote A) (quote B) (quote c) (quote D)}}) #{#{(quote A) (quote c)} #{(quote A) (quote b)} #{(quote B) (quote C) (quote d)}})
             (= (solution #{#{(quote A) (quote B) (quote C) (quote d)} #{(quote A) (quote B) (quote C) (quote D)}}) #{#{(quote A) (quote B) (quote C)}})
             (= (solution #{#{(quote b) (quote c) (quote a) (quote d)} #{(quote B) (quote c) (quote a) (quote d)} #{(quote b) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote C) (quote d)} #{(quote A) (quote C) (quote b) (quote d)} #{(quote A) (quote C) (quote b) (quote D)} #{(quote B) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote C) (quote D)}}) #{#{(quote c) (quote a)} #{(quote A) (quote C)}})
             (= (solution #{#{(quote C) (quote b) (quote a)} #{(quote B) (quote C) (quote a)} #{(quote B) (quote c) (quote a)} #{(quote b) (quote c) (quote a)}}) #{#{(quote a)}})
             (= (solution #{#{(quote B) (quote c) (quote a) (quote d)} #{(quote b) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote C) (quote d)} #{(quote A) (quote C) (quote b) (quote D)} #{(quote B) (quote C) (quote a) (quote D)} #{(quote A) (quote B) (quote c) (quote D)}}) #{#{(quote B) (quote c) (quote a) (quote d)} #{(quote b) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote C) (quote d)} #{(quote A) (quote C) (quote b) (quote D)} #{(quote B) (quote C) (quote a) (quote D)} #{(quote A) (quote B) (quote c) (quote D)}})
             (= (solution #{#{(quote b) (quote c) (quote a) (quote d)} #{(quote B) (quote c) (quote a) (quote d)} #{(quote b) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote c) (quote d)} #{(quote B) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote c) (quote D)}}) #{#{(quote c) (quote a)} #{(quote B) (quote c)}})
             (= (solution #{#{(quote B) (quote c) (quote a) (quote d)} #{(quote b) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote C) (quote d)} #{(quote B) (quote C) (quote a) (quote d)} #{(quote A) (quote B) (quote c) (quote d)} #{(quote A) (quote C) (quote b) (quote D)} #{(quote A) (quote b) (quote c) (quote D)} #{(quote C) (quote b) (quote a) (quote D)}}) #{#{(quote B) (quote d)} #{(quote b) (quote D)}})
             (= (solution #{#{(quote b) (quote c) (quote a) (quote d)} #{(quote A) (quote C) (quote b) (quote d)} #{(quote C) (quote b) (quote a) (quote d)} #{(quote A) (quote b) (quote c) (quote d)} #{(quote B) (quote C) (quote a) (quote D)} #{(quote B) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote c) (quote D)} #{(quote A) (quote B) (quote C) (quote D)}}) #{#{(quote b) (quote d)} #{(quote B) (quote D)}})
             (= (solution #{#{(quote b) (quote c) (quote a) (quote d)} #{(quote A) (quote C) (quote b) (quote d)} #{(quote C) (quote b) (quote a) (quote d)} #{(quote A) (quote b) (quote c) (quote d)} #{(quote B) (quote C) (quote a) (quote D)} #{(quote B) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote c) (quote D)} #{(quote A) (quote B) (quote C) (quote D)}}) #{#{(quote b) (quote d)} #{(quote B) (quote D)}})))

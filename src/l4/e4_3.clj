(ns l4.e4-3)

(comment
 "Clojure has different collections, which differ (slightly) in their behaviour. Functions in
 clojure.core typically transform them into sequences and work on them. It is nonetheless
 important to understand the differences in behaviour and performance to choose an appropriate
 representation for given data."

 "Write a function data-type, which takes a collection as parameter and returns :map, :set, :list
 or :vector depending on which type of collection was passed."

 "It is prohibited to use the list? predicate (or similar functions). The point of this exercise
 is to play around with collections and understand their behaviour.")

; Plan:
; first check if map by adding key and value
; second check if set by adding same item twice and check if size grew
; third check position of conj for list or vector

; it's not perfect, since i should be check if those values are already contained before, but since
; it's simply about understanding the concept it shouldn't be that big of a deal.

(defn data-type [coll]
  (cond
    (:key (conj coll [:key :value])) :map
    (= (conj coll :rnd :rnd) (conj coll :rnd)) :set
    (= (first (conj coll :rnd)) :rnd) :list
    (= (last (conj coll :rnd)) :rnd) :vector))

(assert (= (data-type {:a :b}) :map))
(assert (= (data-type #{:a :b}) :set))
(assert (= (data-type [:a :b]) :vector))
(assert (= (data-type (:a :b)) :list))

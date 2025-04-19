(ns pk22.ex6
  (:import (java.util Map)))

(comment "PK22 A6")

(defmacro nth-expr [nth & args]
  `(case ~nth
     ~@(interleave (range) args)))

(nth-expr (inc 1) 0 "one" (println 2))
(macroexpand-1 '(nth-expr (inc 1) 0 "one" (println 2)))



(comment "PK21 A1")

(declare conjoin)

(defn create-mm [seq]
  (reduce
   conjoin
   {}
   seq))

(def mm (create-mm [1 1 1 2 3 3 4]))


(defn conjoin [mm val]
  (update mm val (fnil inc 0)))

(conjoin mm 4)


(defprotocol Countable
  (cnt [c]))

(extend-protocol Countable
  Map (cnt [mm]
        (reduce
         (fn [acc [_ v]] (+ acc v))
         0
         mm)))

(cnt mm)


(comment "PK21 A3")

(def current-track (ref "Derefs Don't Lie"))
(def current-artist (ref "Shajira"))

(defn next-track [track artist]
  (dosync
   (ref-set current-track track)
   (ref-set current-artist artist)
   nil))

(defn current-song []
  (dosync
   (ensure current-track)
   (ensure current-artist)
   (format "%s - %s" @current-track @current-artist)))

(current-song)


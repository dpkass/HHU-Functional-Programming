(ns problems.elementary.134)

(comment "A nil key")


(comment "Write a function which, given a key and map, returns true iff
the map contains an entry with that key and its value is nil.")


(defn solution
  [& args])


(assert (and (true? (solution :a {:a nil, :b 2}))
             (false? (solution :b {:a nil, :b 2}))
             (false? (solution :c {:a nil, :b 2}))))

(ns problems.easy.047)

(comment "Contain Yourself")


(comment "The contains? function checks if a KEY
is present in a given collection.
This often leads beginner clojurians to use it incorrectly
with numerically indexed collections like vectors and lists.")


(def solution nil)


(assert (and (contains? #{4 6 5} solution)
             (contains? [1 1 1 1 1] solution)
             (contains? {4 :a, 2 :b} solution)
             (not (contains? [1 2 4] solution))))

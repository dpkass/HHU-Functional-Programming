(ns problems.medium.098)

(comment "Equivalence Classes")


(comment "A function f defined on a domain D
induces an equivalence relation on D, as follows:
a is equivalent to b with respect to f
if and only if (f a) is equal to (f b).
Write a function with arguments f and D
that computes the equivalence classes of D with respect to f.")


(defn solution
  [& args])


(assert (and (= (solution (fn* [p1__4831#] (* p1__4831# p1__4831#)) #{0 1 -2 -1 2}) #{#{1 -1} #{-2 2} #{0}})
             (= (solution (fn* [p1__4832#] (rem p1__4832# 3)) #{0 1 4 3 2 5}) #{#{0 3} #{1 4} #{2 5}})
             (= (solution identity #{0 1 4 3 2}) #{#{3} #{2} #{1} #{0} #{4}})
             (= (solution (constantly true) #{0 1 4 3 2}) #{#{0 1 4 3 2}})))

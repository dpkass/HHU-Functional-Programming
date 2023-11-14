(ns problems.medium.078)

(comment "Reimplement Trampoline")

(comment "Reimplement the function described in <a href="76"> "Intro to Trampoline"</a>.")


(defn solution
  [& args])


(assert (and (= (letfn [(triple [x] (fn* [] (sub-two (* 3 x)))) (sub-two [x] (fn* [] (stop? (- x 2)))) (stop? [x] (if (> x 50) x (fn* [] (triple x))))] (solution triple 2)) 82)
             (= (letfn [(my-even? [x] (if (zero? x) true (fn* [] (my-odd? (dec x))))) (my-odd? [x] (if (zero? x) false (fn* [] (my-even? (dec x)))))] (map (partial solution my-even?) (range 6))) [true false true false true false])))

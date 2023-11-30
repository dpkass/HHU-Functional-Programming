(ns l6.e6-1)


(comment "a) Write a function (defn fixedpoint [F guess eps?] ...), which computes a fixed
point of F from an initial value guess. The accuracy eps? should itself be a function that
receives two inputs: (the new and old value) and returns true if the two values match
sufficiently well.")


(defn fixedpoint [F guess eps?]
  (loop [xn guess xn+1 (F xn)]
    (if (eps? xn xn+1)
      xn+1
      (recur xn+1 (F xn+1)))))


(comment "b) Write Newton’s method (from as instance of this fixed point function.")

(defn newton [f f']
  (fn [guess eps]
    (fixedpoint
     (fn newton-seq [x] (- x (/ (f x) (f' x))))
     guess
     #(< (abs (- % %2)) eps))))


(defn is-close
  ([a b]
   (is-close a b 1e-9))
  ([a b abs-diff]
   (< (abs (- a b)) abs-diff)))

(is-close ((newton #(* % %) #(* 2 %)) 1 1e-10) 0)             ;x^2
(is-close ((newton #(* % % %) #(* 3 (* % %))) -1 1e-10) 0)    ; x^3
(is-close ((newton #(- (* % %) 2) #(* 2 %)) 1 1e-6) (Math/sqrt 2) 1e-5) ;x^2-2
(is-close ((newton #(Math/pow (- % 2) 2) #(* 2 (- % 2))) 20 1e-6) 2 1e-5) ; (x-2)^2

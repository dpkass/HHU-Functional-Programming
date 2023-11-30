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

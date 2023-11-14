(ns solved.027)

(comment "Palindrome Detector")


(comment "Write a function which returns true
if the given sequence is a palindrome.

Hint: " racecar " does not equal '(\r \a \c \e \c \a \r)")


(defn solution [col]
  (let [rev (reverse col)]
    (every? true?
            (for [i (range (count col))]
              (= (nth col i) (nth rev i))))))

; found simpler solution
(defn solution [col]
  (= (seq col) (seq (reverse col))))

(assert (and (false? (solution (quote (1 2 3 4 5))))
             (true? (solution "racecar"))
             (true? (solution [:foo :bar :foo]))
             (true? (solution (quote (1 1 3 3 1 1))))
             (false? (solution (quote (:a :b :c))))))

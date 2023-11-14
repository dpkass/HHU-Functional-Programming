(ns problems.medium.104)

(comment "Write Roman Numerals")


(comment "This is the inverse of Problem 92, but much easier.
Given an integer smaller than 4000,
return the corresponding roman numeral in uppercase,
adhering to the subtractive principle.")


(defn solution
  [& args])


(assert (and (= "I" (solution 1))
             (= "I" (solution 1))
             (= "XXX" (solution 30))
             (= "IV" (solution 4))
             (= "CXL" (solution 140))
             (= "DCCCXXVII" (solution 827))
             (= "MMMCMXCIX" (solution 3999))
             (= "XLVIII" (solution 48))))

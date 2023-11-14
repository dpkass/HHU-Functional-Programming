(ns problems.medium.150)

(comment "Palindromic Numbers")


(comment "A palindromic number is a number that is the same when
written forwards or backwards (e.g., 3, 99, 14341).

Write a function which takes an integer n, as its only argument, and
returns an increasing lazy sequence of all palindromic numbers that
are not less than n.

The most simple solution will exceed the time limit!")


(defn solution
  [& args])


(assert (and (= (take 26 (solution 0)) [0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101 111 121 131 141 151 161])
             (= (take 16 (solution 162)) [171 181 191 202 212 222 232 242 252 262 272 282 292 303 313 323])
             (= (take 6 (solution 1234550000)) [1234554321 1234664321 1234774321 1234884321 1234994321 1235005321])
             (= (first (solution (* 111111111 111111111))) (* 111111111 111111111))
             (= (set (take 199 (solution 0))) (set (map (fn* [p1__4843#] (first (solution p1__4843#))) (range 0 10000))))
             (= true (apply < (take 6666 (solution 9999999))))
             (= (nth (solution 0) 10101) 9102019)))

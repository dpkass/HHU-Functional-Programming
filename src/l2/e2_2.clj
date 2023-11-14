(ns l2.e2-2)

(def seq-a (range 100 -101 -1))
(do seq-a)

(def seq-b (for [i (range) :let [v (* i i)] :while (< v 1000)] v))
(do seq-b)

(def seq-c (for [i (range 1000) :when (not (zero? (mod i 6)))] i))
(do seq-c)

(def seq-d (for [n (range 1 1000) :let [m (inc (* n n))]] [n m]))
(do seq-d)

(def seq-e (for [a (range 10)
                 b (range (inc a) 10)
                 c (range (inc b) 10)]
                       [a b c b a]))
(do seq-e)

(ns l10.e10_1)


(comment "Exercise 10.1 (Minesweeper)
Implement Minesweeper (see https://de.wikipedia.org/wiki/Minesweeper, https://www.youtube.com/watch?v=LHY8NKj3RKs).

At least the following functions shall be available on the REPL:
• (init! height width amount-of-mines) should initialize the playing field with corresponding
  height, width and number of mines. Additionally (init!) should use 30 as default value for the
  height, 16 for the width and 99 for the number of mines.

Note: the function shuffle could be useful.

• (reveal! x y) uncovers the field at coordinate (x,y). If a mine happens to be there, the game
  is lost. If there is no mine in the surrounding area of this field, all fields around it should
  be uncovered automatically. (and analogously for the neighbours of those fields, if there are
  also no mines in the surrounding area).

• (flag! x y) should mark the field at (x,y) as mine or remove this mark if it already was marked.
  Marked fields cannot be uncovered by reveal!.

• (print-board!) should output the board in an appropriate format.

Note: This requires the use of time management construct. Make sure that no inconsistent state can occur.
Note: Yes, it is somewhat ugly to extract the fields surrounding a given field.
")

(declare playing-field)

(defn compute [key function]
  (swap! playing-field #(assoc % key (function %))))

(defn put [key value]
  (compute key (constantly value)))

(defn in-scope? [dim coord]
  (let [[h w] dim [x y] coord]
    (and (<= 0 x) (<= 0 y) (< x w) (< y h))))

(defn in-scope-do [state coord f]
  (if (in-scope? (:dim state) coord)
    (f)
    (do
      (println "Coordinates out of scope")
      (:field state))))

(defn _get [field coord]
  (get-in field (reverse coord)))

(defn _set [field [coord value]]
  (assoc-in field (reverse coord) value))


(defn init!
  "initialize the playing field"
  ([] (init! 30 16 99))
  ([h w mines]
   (def playing-field (atom {:field (vec (repeat h (vec (repeat w "x"))))
                             :mines #{}
                             :dim   [h w]}))

   (let [cross-product (fn [seq1 seq2]
                         (set (for [x seq1 y seq2] [x y])))
         mine-coords   (take mines
                             (shuffle (cross-product (range h) (range w))))]
     (put :mines (set mine-coords)))))

(defn reveal! [x y]
  (compute :field (fn [state]
                    (let [{:keys [field
                                  mines
                                  dim]}
                          state]
                      (in-scope-do
                       state [x y]
                       (fn []
                         (if (and
                              (contains? mines [x y])
                              (not= "f" (_get field [x y])))
                           (println "You lost")
                           (let [moves           #{[-1 -1] [-1 0] [-1 1]
                                                   [0 -1] [0 1]
                                                   [1 -1] [1 0] [1 1]}

                                 get-neighbors   (fn [coord]
                                                   (filter #(in-scope? dim %)
                                                           (map #(mapv + coord %) moves)))
                                 get-close-mines (fn [neighbors]
                                                   (filter #(contains? mines %) neighbors))]
                             (letfn [(dfs [field-to-mines coord]
                                       (if (or
                                            (not= "x" (_get field coord))
                                            (contains? field-to-mines coord))
                                         field-to-mines
                                         (let [neighbors         (get-neighbors coord)
                                               close-mines       (get-close-mines neighbors)
                                               close-mines-count (count close-mines)
                                               field-to-mines    (assoc field-to-mines coord close-mines-count)]

                                           (if (pos? close-mines-count)
                                             field-to-mines
                                             (reduce dfs field-to-mines neighbors)))))]
                               (reduce _set field (dfs {} [x y])))))))))))

(defn flag! [x y]
  (compute :field (fn [state]
                    (in-scope-do state [x y] #(_set (:field state) [[x y] "f"])))))

(defn print-board! []
  (doseq [row (:field @playing-field)]
    (println (apply str row))))

(init!)
(flag! 2 2)
(print-board!)
(reveal! 1 2)

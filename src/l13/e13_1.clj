(ns l13.e13-1)


(comment "Exercise 13.1 (Marsrover)
In this task you are asked to implement a simplified version of the Marsrover-kata. For this, you
are to write the control software for a robot that has landed on Mars. The robot has already
scanned a rectangular area for this purpose, which unfortunately is surrounded by obstacles so
that the robot cannot leave it. The requirements are as follows:

• A surface area is given, e.g.
           [[\"x\" \"x\" \"x\" \"x\"]
            [\"x\" \" \" \" \" \"x\"]
            [\"x\" \" \" \" \" \"x\"]
            [\"x\" \"x\" \"x\" \"x\"]]

The data structure is a sequence of sequences that specifies the map with obstacles. The first
sequence (or line) is the northernmost line of the surface, the leftmost entry corresponds to the
westernmost coordinate. Entries that are the string ”x” are obstacles, strings with whitespace
are free (accessible) fields.

• An initial position of the rover and its orientation (:north, :south, :east, :west) is given.
• The signature for initialization is thus: (init! x y orientation surface)
• Implement commands to move the rover forwards (f) and backwards (b).
• Implement command to rotate the rover by 90 degrees left and right (l, r).
• The rover is controlled via a string of commands (e.g. ”flffr”).
• The state of the rover is manipulated by (execute! string-sequence).
• If there is an obstacle in the way, the rover should abort further execution of
the command sequence and report the position of the obstacle.
• The function rover-status should return the tuple [x y direction] with current information about the rover.
• Your solution must allow the addition of further commands,without the need to modify existing
code.

Note: Use multimethods.")

(def rover (atom 0))
(declare surface)

(defn init! [x y orientation surface]
  (reset! rover {:pos [x y] :orn orientation :status :ready})
  (def surface {:dim [(count surface) (-> surface first count)] :surface surface})
  nil)

(defn in-scope? [dim coord]
  (let [[h w] dim [x y] coord]
    (and (< -1 x w) (< -1 y h))))

(defn get-move [orientation]
  (cond
    (= orientation :north) [0 -1]
    (= orientation :south) [0 1]
    (= orientation :east) [1 0]
    (= orientation :west) [-1 0]))

(defn get-rotation [orientation dir]
  (cond
    (= orientation :north) (if (= dir :r) :east :west)
    (= orientation :south) (if (= dir :l) :east :west)
    (= orientation :east) (if (= dir :l) :north :south)
    (= orientation :west) (if (= dir :r) :north :south)))

(defn get-field [[x y]]
  (get-in (:surface surface) [y x]))

(defn rover-status []
  (let [{[x y] :pos orn :orn} @rover] [x y orn]))

(defn _fail [state reason]
  (assoc state :status :failed
               :reason reason))

(defn _move [rover dir]
  (let [{:keys [pos orn]} rover new-pos (mapv dir pos (get-move orn))]
    (cond
      (not (in-scope? (:dim surface) new-pos)) (_fail rover (format "Move to pos %s out of scope." new-pos))
      (not= " " (get-field new-pos)) (_fail rover (format "Move to pos %s blocked by obstacle." new-pos))
      :else (assoc rover :pos new-pos))))

(defn _rotate [rover dir] (assoc rover :orn (get-rotation (:orn rover) dir)))

(defmulti _execute #(identity %2))
(defmethod _execute \f [r _] (_move r +))
(defmethod _execute \b [r _] (_move r -))
(defmethod _execute \r [r _] (_rotate r :r))
(defmethod _execute \l [r _] (_rotate r :l))

(defn execute! [str]
  (swap! rover
         (fn [rover]
           (reduce
            (fn [rover cmd]
              (let [{:keys [status reason] :as rover} (_execute rover cmd)]
                (cond
                  (= status :ready) rover
                  (= status :failed) (do
                                       (println "Execution failed." reason)
                                       (reduced (-> rover
                                                    (assoc :status :ready)
                                                    (dissoc :reason)))))))
            rover
            str)))
  nil)




(init! 0 0 :north [[" " "x" " "] [" " " " " "]])
(execute! "brfflff")
(rover-status)

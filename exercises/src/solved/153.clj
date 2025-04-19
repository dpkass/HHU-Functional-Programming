(ns problems.easy.153)

(comment "Pairwise Disjoint Sets")


(comment "Given a set of sets, create a function which returns true if no
two of those sets have any elements in common (1) and false otherwise. Some of the
test cases are a bit tricky, so pay a little more attention to them.

(1) Such sets are usually called pairwise disjoint or mutually disjoint.")


(defn solution
  [& args])


(assert (and (= (solution #{#{\L \P} #{\E \e \R} #{\U} #{\s} #{\.}}) true)
             (= (solution #{#{:c :b :a} #{:e :c :b :d :a} #{:c :b :d :a} #{:b :a} #{:a}}) false)
             (= (solution #{#{1 [3 4] 2 [5]} #{[1 2 3] [4 5]} #{4 3 5 [2] [1]} #{[3 4 5] [1 2]}}) true)
             (= (solution #{#{(quote (quote f)) (quote (quote a)) (quote (quote c))} #{(quote c) (quote e) (quote d)} #{(quote b) (quote a)} #{(quote h) (quote f) (quote i) (quote g)}}) true)
             (= (solution #{#{#{} #{:z} #{:y :z :x} #{:y :x}} #{(quote (:x :y :z)) (quote (:z)) (quote (:x :y)) (quote ())} #{(quote [:x :y :z]) [] {} [:x :y] [:z]}}) false)
             (= (solution #{#{(symbol "true") (quote false)} #{:foreclojuretransform.core/no (keyword "yes")} #{:yes :no} #{0 (class 1)} #{false (= "true")} #{(class (quote 1)) (int \0)}}) false)
             (= (solution (set [(set [distinct?]) (set [(fn* [p1__4844#] (-> p1__4844#)) (fn* [p1__4845#] (-> p1__4845#))]) (set [(fn* [p1__4846#] (-> p1__4846#)) (fn* [p1__4847#] (-> p1__4847#)) (fn* [p1__4848#] (-> p1__4848#))]) (set [(fn* [p1__4849#] (-> p1__4849#)) (fn* [p1__4850#] (-> p1__4850#)) (fn* [p1__4851#] (-> p1__4851#))])])) true)
             (= (solution #{#{contains? set nil? (do)} #{} #{mapcat (quote +) (quote *) (comment mapcat)} #{(quote mapcat) ((fn* [] (-> *))) +}}) false)))

(ns problems.easy.157)

(comment "Indexing Sequences")


(comment "Transform a sequence into a sequence of pairs containing the original
elements along with their index.")


(defn solution
  [& args])


(assert (and (= (solution [:a :b :c]) [[:a 0] [:b 1] [:c 2]])
             (= (solution [0 1 3]) (quote ((0 0) (1 1) (3 2))))
             (= (solution [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]])))

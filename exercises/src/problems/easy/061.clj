(ns problems.easy.061)

(comment "Map Construction")


(comment "Write a function which takes a vector of keys
and a vector of values and constructs a map from them.")


(defn solution
  [& args])


(assert (and (= (solution [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
             (= (solution [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
             (= (solution [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})))

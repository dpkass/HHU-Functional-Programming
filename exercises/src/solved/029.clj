(ns solved.029)

(comment "Get the Caps")


(comment "Write a function which takes a string
and returns a new string containing only the capital letters.")


(defn solution [s]
  (let [re #"[A-Z]"]
    (apply str (filter
                 (fn [ch]
                   (re-find re (str ch)))
                 s))))

; found better solution. use partial for preset values! use comp to turn ch into str first.
(defn solution [s]
  (let [re #"[A-Z]"]
    (apply str (filter (comp (partial re-find re) str) s))))


(assert (and (= (solution "HeLlO, WoRlD!") "HLOWRD")
             (empty? (solution "nothing"))
             (= (solution "$#A(*&987Zf") "AZ")))

; use str, vector, list, has-map and hash-set functions
(str "Hello" "World")

(conj '(1 2 3) 4)

(first [1 2 3 4])

(get {:a 1 :b 2} :a)

(hash-set 1 2 3 1 1 2)

; takes a number and adds 100 to it.
(defn inc100
  [number]
  (+ 100 number))

(defn dec-maker
  [number]
  #(- % number))

; the shortcut form for (fn ) is #( )
(= ((fn [x] (+ x 2)) 2) (#(+ % 2) 2))
; true

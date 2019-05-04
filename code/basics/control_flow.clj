; if
(defn sum
  [x y]
  (if (> x y) (- x y) (- y x)))

(println (sum 3 4))
(println (sum 8 4))

;when
(defn is-empty
  [x]
  (when (empty? x) (str x " is empty")))

(println (is-empty []))
(println (is-empty '(1 2 2)))

(defn pow
  [x y]
  (loop [acc 1 n y]
    (if (zero? n)
      acc
      (recur (* x acc) (dec n)))))

(println (pow 2 1))
; 2
(println (pow 4 0))
; 1
(println (pow 5 3))
; 125


(defn factorial
  [x]
  (loop [n x acc 1]
    (if (= n 1)
     acc
      (recur (dec n) (* acc n)))))

(println (factorial 4))
; 24
(println (factorial 2))
; 2

(defn counter
  [start end]
  (loop [acc start]
    (when (not= end acc)
      (println acc)
      (recur (inc acc)))))

(println (counter 12 34))

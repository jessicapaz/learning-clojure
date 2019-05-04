(defn sum
  ([] 42)
  ([x y] (+ x y)))

(println (sum))
; 42
(println (sum 3 4))
; 7

(defn greet
  ([my-name] (str "Hi, my name is " my-name))
  ([my-name age] (str (greet my-name) " and I'm " age " yo")))

(println (greet "Jessica"))
; Hi, my name is Jessica
(println (greet "Jessica" 21))
; Hi, my name is Jessica and I'm 21 yo

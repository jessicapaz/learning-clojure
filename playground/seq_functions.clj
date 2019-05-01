; map
(println (map + [1 2 3] [2 3 4]))
; (3 5 7)
(println (map str "abc" ["A" "B" "C"]))
; (aA bB cC)
(println (map #(+ 3 %) [1 2 3]))
; (4 5 6)

; reduce
(println (reduce + [3 4 5 6]))
; 18
(println (reduce conj [1 2 3] [4 5]))
; [1 2 3 4 5]

; take
(println (take 2 [1 2 3]))
; (1 2)

;drop
(println (drop 1 [1 2 3 4]))
; (2 3 4)

;take-while
(def values
  [{:number 1}
   {:number 2}
   {:number 3}
   {:number 4}
   {:number 5}])

(println (take-while #(< (:number %) 3) values))
;({:number 1} {:number 2})

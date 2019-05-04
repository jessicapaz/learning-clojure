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

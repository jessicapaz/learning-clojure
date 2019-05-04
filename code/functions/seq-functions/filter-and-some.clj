(filter odd? (range 20))
; (1 3 5 7 9 11 13 15 17 19)

(filter #(= (rem % 3) 0) (range 30))
; (0 3 6 9 12 15 18 21 24 27)

(filter #(= (count %) 2) ["aa", "b", "ccc", "dd"])
; ("aa", "dd")

(some even? [1 2 3 4])
; true

(some #(> % 5) [1 2 3])
; nil

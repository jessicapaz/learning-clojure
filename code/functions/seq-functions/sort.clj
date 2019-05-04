(sort [8 5 3 9 0 2])
; --> (0 2 3 5 8 9)

(sort-by count ["aaa" "b" "cccc" "dd"])
; --> ("b" "dd" "aaa" "cccc")

(sort-by first [[9 2] [2 3] [3 4]])
; -- > ([2 3] [3 4] [9 2])

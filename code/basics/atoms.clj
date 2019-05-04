(def a (atom :old))

@a
; -->  :old

; Sets the value of atom to a new value without regard for the current value
(reset! a :new)

@a
; --> :new

(def value (atom 10))

; Atomically swaps the value of the atom with a new one based on a particular function.
(swap! value dec)
; --> 9

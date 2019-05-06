(defn read-file [file-path]
  (with-open [rdr (clojure.java.io/reader file-path)]
    (reduce conj [] (line-seq rdr))))

(defn write-file
  [lines-list output-file]
  (let [p (partition 3 lines-list)]
    (def p-string (for [x p] (apply str x))))
  (with-open [w (clojure.java.io/writer output-file :append true)]
    (doseq [i p-string]
      (.write w (str i "\n")))))

(let [lines-list (read-file "input-file.txt")]
  (write-file lines-list "output-file.txt"))

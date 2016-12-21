(defn two-pow [n]
  (if (== 0 n)
    1
    (*' 2 (two-pow (dec n)))))

(->> 1000
     two-pow
     str
     (re-str #"\d")
     (map #(Integer/parseInt %))
     (reduce +)
     time) ;; "Elapsed time: 0.776804 msecs" 1366

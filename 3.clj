(declare prime?)
(declare factors)
(declare prime-factors)

(->> 600851475143
     prime-factors
     last
     print
     time) ;; 6857"Elapsed time: 119.739637 msecs"

(defn prime? 
  [n]
  (reduce (fn [r i]
            (if (not r)
              (reduced false)
              (if (zero? (mod n i))
                false true)))
          true
          (range 2 (dec n))))

(defn factors
  [x]
  (into (sorted-set)
        (reduce concat
                (for [r (range 1 (inc (Math/sqrt x)))
                      :when (zero? (mod x r))]
                  [r (/ x r)]))))

(defn prime-factors
  [x]
  (filter prime? (factors x)))

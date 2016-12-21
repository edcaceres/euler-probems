(defn get-divisors [x]
  (into (sorted-set)
        (reduce concat
                (for [r (conj (vec (range 1 (inc (Math/sqrt x)))) x)
                      :when (zero? (mod x r))]
                  [r (/ x r)]))))

(defn seq-triangle-numbers []
  (map last
       (iterate
        (fn [[a b]] [(inc a) (reduce + (range (dec a)))])
        [4 1])))

(let [divisors 500]
  (->> (seq-triangle-numbers)
       (map get-divisors)
       (drop-while #(<= (count %) divisors))
       (first)
       (last)
       (print)
       (time))) ;; 76576500"Elapsed time: 12359.330283 msecs"

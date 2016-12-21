(let [primes-for 2000000
      primes (remove
              (into #{}
                    (mapcat #(range (* % %) primes-for %))
                    (range 3 (Math/sqrt primes-for) 2))
              (cons 2 (range 3 primes-for 2)))]
  (->> primes
       (reduce +)
       print
       time)) ;; 142913828922"Elapsed time: 494.50655 msecs"

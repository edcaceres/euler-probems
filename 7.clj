;; 10001st prime
;; By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

;; What is the 10 001st prime number?

(def primes (for [x (iterate #(if (== 2 %) (inc %) (+ % 2)) 2)
                  :when (reduce #(if (= false %1) (reduced false) (not= 0 (mod x %2))) true (range 2 x))]
              x))

(->> primes 
     (drop (dec 10001))
     (take 1)
     (print))

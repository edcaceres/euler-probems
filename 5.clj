;; Smallest multiple
;; 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

;; What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

(let [rcount (reverse (range 1 (inc 20)))]
  (->> (for [i (range)
             :when (reduce #(if (= %1 false) (reduced false) (= 0 (mod i %2))) rcount)]
         i)
       (drop 1)
       (take 1)
       print
       time))

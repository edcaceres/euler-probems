(let [result (for [a (range 1 (/ (inc 1000) 3))
                   b (range (inc a) (/ (inc 1000) 2))
                   c (range (inc b) (inc 1000))
                   :when (and (== (+ (* a a) (* b b)) (* c c))
                              (== 1000 (+ a b c)))]
               (* a b c))]
  (-> result
      first
      (print " ")
      time)) ;; 31875000  "Elapsed time: 8864.115731 msecs"

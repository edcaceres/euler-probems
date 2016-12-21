(defn find-is [x]
  (loop [c x
         r [c]]
    (if (== 1 c)
      r
      (if (even? c)
        (recur (/ c 2) (conj r (/ c 2)))
        (recur (+ 1 (* 3 c)) (conj r (+ 1 (* 3 c))))))))

(->> 1000000
     (range 1)
     (reduce (fn [r n]
               (let [c (count (find-is n))]
                 (if (> c (last r))
                   [n c]
                   r))) [0 0])
     print
     time) ;; [837799 525]"Elapsed time: 28804.966926 msecs"

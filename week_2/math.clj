(defn exercise-math [a b c ]
  [(+ a b c)
  (* a b c)
   (/ a b c)
   (+ (* a a) (* 3 b) c )
   (+ (int (Math/pow c a)) (int (Math/pow a c)))
   (+ a (/ c b))
   (+ (* a b c) 1)
   (- (* a b c) 1)]
  )

(defn exercise-logic [a b c]
  [
   (> a b)
   (> b a)
   (< a b)
   (< b c)
   (>= c c)
   (= a c)
   (<= a b)
   (and (< a b) (> b c))
   (or (< a b) (> b c))
   ])



(defn print-math-results [a b c]
  (doseq [result (exercise-math a b c)]
    (println result)))

(defn print-logic-results [a b c]
  (doseq [result (exercise-logic a b c)]
    (println result)))

(print-math-results 2 3 4)
(print-logic-results 2 3 4)

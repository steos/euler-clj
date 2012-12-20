(ns euler.common)

(defn fibonacci-series
  ([]
     (fibonacci-series 1 2))
  ([a b]
     (cons a (lazy-seq
              (fibonacci-series b (+ b a))))))

(defn sum [coll] (reduce + coll))

(defn take-until [n coll]
  "returns a lazy seq of items from coll
  while item is less than n"
  (take-while #(< % n) coll))

(defn fac? [n m]
  "check if n can be evenly divided by m
   i.e. this does (= 0 (mod n m))"
  (= 0 (mod n m)))

(defn now [] (System/nanoTime))




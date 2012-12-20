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

(defn square [n] (* n n))

(defn ctoi [char] (- (int char) 48))

(defn factorial [n] (apply * (range 1N (inc n))))

(defn sum-digits [n] (sum (map ctoi (str n))))

(defn power-of-2 [exp] (apply * (repeat exp 2N)))

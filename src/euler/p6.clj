(ns euler.p6)

(defn sum [coll] (reduce + coll))

(defn sum-of [f coll] (sum (map f coll)))

(defn square [n] (* n n))

(defn solve [n]
  (let [xs (range 1 (inc n))
        sum-of-squares (sum-of square xs)
        square-of-sum (square (sum xs))]
    (- square-of-sum sum-of-squares)))

(def test-with [10 2640])
(def solve-for 100)

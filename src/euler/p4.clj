(ns euler.p4 (:use [euler common]))

(defn decimal-palindrome? [n]
  (if (< n 10)
    false
    (palindrome? (Integer/toString n))))

(defn products [max]
  (let [nums (range (dec max) 0 -1)]
    (for [x nums y nums]
      (* x y))))

(defn palindromes [coll]
  (filter decimal-palindrome? coll))

(defn solve [n]
  (reduce max (palindromes (products n))))

(def test-with [100 9009])
(def solve-for 1000)

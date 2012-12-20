
(ns euler.p1
  (:use [euler.common :only (fac?)]))

(defn mult-of-any? [n xs]
  (some (partial fac? n) xs))

(defn mults-of-any [& xs]
  (filter #(mult-of-any? % xs) (iterate inc 1)))

(defn sum-until [n coll]
  (reduce + (take-while #(< % n) coll)))

(defn solve [n]
  (sum-until n (mults-of-any 3 5)))

(def test-with [10 23])
(def solve-for 1000)


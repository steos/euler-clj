(ns euler.p20 (:use [euler common]))

(defn sum-digits [n]
  (sum (map ctoi (str n))))

(defn solve [n]
  (sum-digits (factorial n)))

(def solve-for 100)
(def test-with [10 27])


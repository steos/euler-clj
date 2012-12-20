(ns euler.p16 (:use [euler common]))

(defn solve [n]
  (sum-digits (power-of-2 n)))

(def solve-for 1000)
(def test-with [15 26])

(ns euler.p20 (:use [euler common]))

(defn solve [n]
  (sum-digits (factorial n)))

(def solve-for 100)
(def test-with [10 27])


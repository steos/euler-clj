(ns euler.p5
  ;; cheating?
  (:use [clojure.math.numeric-tower :only (lcm)]))

(defn solve [n]
  (reduce lcm (range 2 (inc n))))

(def test-with [10 2520])
(def solve-for 20)

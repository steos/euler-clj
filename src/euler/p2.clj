(ns euler.p2 (:use [euler common]))

(defn solve [n]
  (let [nums (take-until n (fibonacci-series))]
    (sum (filter even? nums))))

(def solve-for 4e6)

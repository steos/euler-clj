(ns euler.p2 (:use [euler common]))

(defn solve [n]
  (sum
   (filter even?
           (take-while #(< % n)
                       (fibonacci-series)))))

(def solve-for 4e6)

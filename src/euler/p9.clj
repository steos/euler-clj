(ns euler.p9 (:use [euler common]))

(defn pythagorean-triplet? [a b c]
  (= (square c) (+ (square a)
                   (square b))))

(defn solve [n]
  (let [nums (range 1 n)]
    (reduce *
            (first
             (for [a nums b nums c nums
                   :when (and (< a b c)
                              (= (+ a b c) n)
                              (pythagorean-triplet? a b c))]
               [a b c])))))

(def solve-for 1000)




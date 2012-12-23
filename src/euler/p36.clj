(ns euler.p36 (:use [euler common]))

(defn binary-palindrome? [n]
  (palindrome? (Integer/toBinaryString n)))

(defn bin-dec-palindrome? [n]
  (and (binary-palindrome? n)
       (decimal-palindrome? n)))

(defn solve [n]
  (let [nums (range 0 n)]
    (sum (filter bin-dec-palindrome? nums))))

(def solve-for 1e6)

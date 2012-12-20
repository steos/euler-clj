(ns euler.p4)

(defn palindrome? [xs]
  (let [x (seq (str xs))]
    (if (= 1 (count x))
      false
      (= (reverse x) x))))

(defn products [max]
  (distinct
   (for [x (range 1 max)
         y (range 1 max)]
     (* x y))))

(defn palindromes [coll]
  (filter palindrome? coll))

(defn solve [n]
  (apply max (palindromes (products n))))

(def test-with [100 9009])
(def solve-for 1000)

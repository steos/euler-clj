(ns euler.common)

(defn fac? [n m]
  "check if n can be evenly divided by m
   i.e. this does (= 0 (mod n m))"
  (= 0 (mod n m)))

(defn now [] (System/nanoTime))




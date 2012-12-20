(ns euler.p2)

(defn fib
  ([]
     (fib 1 2))
  ([a b]
     (cons a (lazy-seq (fib b (+ b a))))))

(defn solve [n]
  (reduce +
          (filter even?
                  (take-while #(< % n)
                              (fib)))))

(def solve-for 4e6)

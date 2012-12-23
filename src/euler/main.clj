(ns euler.main
  (:gen-class)
  (:use euler.common)
  (:require [euler p1 p2 p4 p5 p6 p8 p16 p20 p36]))

(def +format+ "  %12s -> %-28s")

(defn euler-ns []
  (sort (filter #(re-matches #"euler.p[0-9]+" %)
                (map (comp name ns-name) (all-ns)))))

(defn run-solve [f input expect]
  (let [start (now)
        result (if (nil? input) 
                 (f) (f input))
        time (- (now) start)]
    (when (and expect
               (not= expect result))
      (println (format " check failed, expected %s" 
                       (str expect))))
    (println (format (str +format+ " %4f ms")
                     (str input)
                     (str result)
                     (/ time 1e6)))))

(defn run-ns [name]
  (let [ns (symbol name)
        nspub (ns-publics ns)
        solve-for (nspub 'solve-for)
        test-with (nspub 'test-with)
        solver (nspub 'solve)]
    (if (nil? solve-for) 
      (run-solve solver nil nil)
      (do (when-not (nil? test-with)
            (let [[in out] @test-with]
              (run-solve solver in out)))
          (run-solve solver @solve-for nil)))))

(defn -main []
  (println (format (str +format+ " %s")
                   "input" "output" "time"))
  (println (apply str (repeat 56 \-)))
  (doseq [ns (euler-ns)]
    (println ns)
    (run-ns ns)))


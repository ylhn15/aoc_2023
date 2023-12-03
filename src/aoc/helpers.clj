(ns aoc.helpers 
  (:require
   [clojure.string :as str]))

(defn format-input [input]
  (str/split-lines (slurp input)))

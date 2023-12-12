(ns aoc.day-01-test
  (:require
   [aoc.code.day_01 :as day_01]
   [aoc.helpers :refer [format-input]]
   [clojure.test :refer [deftest is testing]]))

(deftest test-solution-1
  (testing "Test return value of solution 1 of day 1 of aoc, should be 142"
    (is (=
         (day_01/solution-1 (format-input "input/day_01/testinput.txt"))
         142))))

(deftest test-solution-2
  (testing "Test return value of solution 1 of day 1 of aoc, should be 299"
    (is (=
         (day_01/solution-2 (format-input "input/day_01/testinput2.txt"))
         299))))

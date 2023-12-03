(ns aoc.day-01-test
  (:require
   [aoc.code.day_01 :as day_01]
   [clojure.test :refer [deftest is testing]]))

(deftest test-solution-1
  (testing "Test return value of solution 1 of day 1 of aoc, should be 142"
    (is (=
         (day_01/solution-1 "input/day_01/testinput.txt")
         142))))

(deftest test-solution-2
  (testing "Test return value of solution 1 of day 1 of aoc, should be 142"
    (is (=
         (day_01/solution-2 "input/day_01/testinput2.txt")
         142))))

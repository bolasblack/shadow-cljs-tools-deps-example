(ns test.core-test
  (:require [pjstadig.humane-test-output]
            [cljs.test :as ct :refer [deftest testing is]]
            [test.core :as c]))

(deftest hello
  (is (c/plus 1 1)))

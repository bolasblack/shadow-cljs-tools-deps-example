(ns test.core-test
  (:require
   [clojure.test.check]
   [clojure.test.check.generators]
   [clojure.test.check.properties]
   [pjstadig.humane-test-output]
   [cljs.test :as ct :refer [deftest testing is]]
   [test.core :as c]))

(defn -main [])

(deftest hello
  (is (c/test-fn identity) 1))

(deftest js-dot
  (is (.-a #js {:a 1})))

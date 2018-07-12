(ns test.core
  (:require [cljs.spec.alpha :as s]))

(defn test-fn [cb]
  (when-not (s/valid? ::test-args-cb cb)
    (throw (js/Error. (s/explain-str ::test-args-cb cb))))
  (cb 1))

(s/def ::test-args-cb
  (s/fspec :args (s/tuple number?)
           :ret number?))

(s/def ::test-args
  (s/tuple ::test-args-cb))

(s/def ::test-result
  number?)

(s/fdef test-fn
  :args ::test-args
  :ret ::test-result)

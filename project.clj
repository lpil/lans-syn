(defproject lans-syn "0.0.1-SNAPSHOT"
  :description "Louis' ANS Synthesizer"
  :url "http://github.com/lpil/lans-synthesizer"
  :license {:name "Mozilla Public License, version 2.0"
            :url "https://www.mozilla.org/MPL/2.0/"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [overtone "0.9.1"]
                 [quil "2.2.4"]]
  :profiles {:dev {:plugins [[com.jakemccrary/lein-test-refresh "0.5.2"]]}})

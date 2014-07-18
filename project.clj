(defproject hello "0.1.0-SNAPSHOT"
  :min-lein-version "2.0.0"
  :description "First Clojure web app"
  :url "ttp://still-sierra-6479.herokuapp.com"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring "1.3.0"]
                 [compojure "1.1.8"]
                 [de.ubercode.clostache/clostache "1.4.0"]]
  :main hello.core)

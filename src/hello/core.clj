(ns hello.core
  (:use compojure.core)
  (:require
    [ring.adapter.jetty :as jetty]))

(defroutes main-routes
  (GET "/" [] "hello world"))

(defn -main []
  (jetty/run-jetty main-routes {:port 5000}))

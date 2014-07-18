(ns hello.core
  (:require
    [ring.adapter.jetty :as jetty]))

(defn -main []
  (jetty/run-jetty
    (fn [req] {:status 200
               :body "hello world"})
    {:port 5000}))

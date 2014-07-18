(ns hello.core
  (:use compojure.core)
  (:require
    [ring.adapter.jetty :as jetty]
    [clostache.parser :as clostache]))

(defn read-template [template-name]
  (slurp (clojure.java.io/resource
    (str "templates/" template-name ".mustache"))))

(defn render-template [template-name params]
  (clostache/render (read-template template-name) params))

(defn index []
  (render-template "index" {:greeting "Bonjour"}))

(defroutes main-routes
  (GET "/" [] (index)))

(defn -main []
  (jetty/run-jetty main-routes {:port 5000}))

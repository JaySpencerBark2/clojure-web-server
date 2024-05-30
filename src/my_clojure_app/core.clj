(ns my-clojure-app.core
  (:require [ring.adapter.jetty :as jetty]))

(defn app [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello, World!"})

(defn -main []
  (jetty/run-jetty app {:port 3000}))
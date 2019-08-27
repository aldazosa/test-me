(ns test-me.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [test-me.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[test-me started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[test-me has shut down successfully]=-"))
   :middleware wrap-dev})

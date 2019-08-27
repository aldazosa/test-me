(ns test-me.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[test-me started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[test-me has shut down successfully]=-"))
   :middleware identity})

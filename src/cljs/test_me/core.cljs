(ns test-me.core
  (:require
    [reagent.core :as r]))


(defn page []
  [:p :foobar33])

;; -------------------------
;; Routes


(defn mount-components []
  (r/render [#'page] (.getElementById js/document "app")))

(defn init! []
  (mount-components))

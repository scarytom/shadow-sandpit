(ns core
(:require [reagent.core :as r]))
(defn main []
  (r/with-let [foo (r/atom "bar")]
    (js/console.log @foo))
)
(main)

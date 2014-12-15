(ns lans-syn.dynamic
  (:require [quil.core :as q]))

(def starting-state
  {})

(defn setup []
  (q/frame-rate 30)
  starting-state)

(defn update [{:keys []
               :as state}]
  state)

(defn draw [{:keys []
             :as state}]
  (q/ellipse (/ (q/width) 2) (/ (q/height) 2) 10 10))

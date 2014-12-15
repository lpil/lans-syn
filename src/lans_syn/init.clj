(ns lans-syn.init
  (:require [quil.core :as q]
            [quil.middleware :as m]
            [lans-syn.dynamic :as dynamic]))

(q/defsketch lans-syn
  :title "Louis' ANS Synthesizer"
  :size [720 500]
  :setup dynamic/setup
  :update dynamic/update
  :draw dynamic/draw
  :middleware [m/fun-mode])

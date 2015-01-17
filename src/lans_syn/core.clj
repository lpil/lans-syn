; This Source Code Form is subject to the terms of the Mozilla Public
; License, v. 2.0. If a copy of the MPL was not distributed with this
; file, You can obtain one at http://mozilla.org/MPL/2.0/.

(ns lans-syn.core
  (:require [lans-syn.theory :as theory]
            [overtone.live :as o]))

(o/definst voice
  [freq 440
   amp 1]
  (* amp (o/sin-osc freq)))

(defn build-voices
  "Set up the oscillators, muted"
  []
  (vec (map
         #(voice (theory/TET72-note->freq %) 0)
         (take 720 (range)))))

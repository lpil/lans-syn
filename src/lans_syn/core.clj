; This Source Code Form is subject to the terms of the Mozilla Public
; License, v. 2.0. If a copy of the MPL was not distributed with this
; file, You can obtain one at http://mozilla.org/MPL/2.0/.

(ns lans-syn.core
  (:require [clojure.math.numeric-tower :as tow]
            [overtone.live :as o]))

(defn oscs
  "Set up the oscillators"
  []
  (prn (take 720 (range))))


(defn note->freq
  "Converts a note number to it's frequency.
  Reverence pitch is 440 hertz"
  [note]
  (let [reference-pitch 440
        twelth-root-of-one (tow/expt 2 (/ 1 12)) ]
    (* reference-pitch
       (tow/expt twelth-root-of-one (- note 49)))))

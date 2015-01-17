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

(defn TET-N-note->freq
  "Converts a TET N note number to it's frequency, where N is the
  number of semitones per octave in that scale.
  Reference pitch is A4: 440 hertz"
  [note semitones-per-octave]
  (let [bottom-freq 16.352
        TET-freq-ratio (tow/expt 2 (/ 1 semitones-per-octave))]
    (* bottom-freq
       (tow/expt TET-freq-ratio note))))

(defn TET72-note->freq
  "Converts a note number to it's frequency for TET72.
  Reference pitch is 440 hertz"
  [note]
  (TET-N-note->freq note 72))

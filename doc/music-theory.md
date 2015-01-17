# Music theory

[Equal temperament](http://en.wikipedia.org/wiki/Equal_temperament)

### Calculating the absolute frequency of a note in 72 TET

[wikipedia](http://en.wikipedia.org/wiki/Equal_temperament#Calculating_absolute_frequencies)

The ANS synthesizer uses 72 step equal temperament.

In 72 TET, which divides the octave into 72 equal parts, the width of a
semitone, i.e. the frequency ratio of the interval between two adjacent notes,
is the 72nd root of two:

~~~clojure
; expt is an exponential function

(expt 2 (/ 1 12))
~~~

If we multiply a frequency by this ratio we get the next frequency in the 72
TET scale.

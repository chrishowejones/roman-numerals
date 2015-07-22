(ns roman-numerals.core)

(def numerals [[1000 "M"] [900 "CM"] [500 "D"] [400 "CD"] [100 "C"] [90 "XC"] [50 "L"] [40 "XL" ] [10 "X"] [9 "IX"] [5 "V"] [4 "IV"] [1 "I"]])

(defn convert-to-numeral
  "Recursive version of convert arabic integer to roman numeral"
  [n]
  (loop [numeral-str "" left n numeral-tuples numerals]
    (if (zero? left)
      numeral-str
      (let [[[arabic roman] & more] numeral-tuples]
        (if (< left arabic)
          (recur numeral-str left more)
          (recur (str numeral-str roman) (- left arabic)
                 numeral-tuples))))))

(defn- generate-numerals [arabic roman num result]
  (let [q (quot num arabic)]
    [(- num (* q arabic)) (apply str result (repeat q roman))]))

(defn- arabic->roman [[num result] [arabic roman]]
  (if (>= num arabic)
    (generate-numerals arabic roman num result)
    [num result]))

(defn reduce-to-numeral
  "Reducing version of convert arabic integer to roman numeral"
  [n]
  (second (reduce arabic->roman [n ""] numerals)))
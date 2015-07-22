(ns roman-numerals.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals.core :refer :all]))

(deftest test-convert-arabic-to-roman
  (testing "convert 1 to I"
    (is (= (convert-to-numeral 1) "I")))
  (testing "convert 2 to II"
    (is (= (convert-to-numeral 2) "II")))
  (testing "convert 3 to III"
    (is (= (convert-to-numeral 3) "III")))
  (testing "convert 4 to IV"
    (is (= (convert-to-numeral 4) "IV")))
  (testing "convert 5 to V"
    (is (= (convert-to-numeral 5) "V")))
  (testing "convert 6 to VI"
    (is (= (convert-to-numeral 6) "VI")))
  (testing "convert 8 to VIII"
    (is (= (convert-to-numeral 8) "VIII")))
  (testing "convert 9 to IX"
    (is (= (convert-to-numeral 9) "IX")))
  (testing "convert 10 to X"
    (is (= (convert-to-numeral 10) "X")))
  (testing "convert 11 to XI"
    (is (= (convert-to-numeral 11) "XI")))
  (testing "convert 15 to XV"
    (is (= (convert-to-numeral 15) "XV")))
  (testing "convert 39 to XXXIX"
    (is (= (convert-to-numeral 39) "XXXIX")))
  (testing "convert 40 to XL"
    (is (= (convert-to-numeral 40) "XL")))
  (testing "convert 50 to L"
    (is (= (convert-to-numeral 50) "L")))
  (testing "convert 89 LXXXIX"
    (is (= (convert-to-numeral 89) "LXXXIX")))
  (testing "convert 90 to XC"
    (is (= (convert-to-numeral 90) "XC")))
  (testing "convert 99 to XCIX"
    (is (= (convert-to-numeral 99) "XCIX")))
  (testing "convert 100 to C"
    (is (= (convert-to-numeral 100) "C")))
  (testing "convert 384 to CCCLXXXIV"
    (is (= (convert-to-numeral 384) "CCCLXXXIV")))
  (testing "convert 400 to CD"
    (is (= (convert-to-numeral 400) "CD")))
  (testing "convert 500 to D"
    (is (= (convert-to-numeral 500) "D")))
  (testing "reduce 899 to DCCCXCIX"
    (is (= (convert-to-numeral 899) "DCCCXCIX")))
  (testing "reduce 900 to CM"
    (is (= (convert-to-numeral 900) "CM")))
  (testing "reduce 1000 to M"
    (is (= (convert-to-numeral 1000) "M")))
  (testing "reduce 3999 to MMMCMXCIX"
    (is (= (convert-to-numeral 3999) "MMMCMXCIX"))))

(deftest test-convert-roman-to-arabic
  (testing "convert I to 1"
    (is (= (convert-to-arabic "I") 1)))
  (testing "convert II to 2"
    (is (= (convert-to-arabic "II") 2)))
  (testing "convert III to 3"
    (is (= (convert-to-arabic "III") 3)))
  (testing "convert IV to 4"
    (is (= (convert-to-arabic "IV") 4)))
  (testing "convert V to 5"
    (is (= (convert-to-arabic "V") 5))))

(deftest test-reduce-to-numeral
  (testing "reduce 1 to I"
    (is (= (reduce-to-numeral 1) "I")))
  (testing "reduce 2 to II"
    (is (= (reduce-to-numeral 2) "II")))
  (testing "reduce 3 to III"
    (is (= (reduce-to-numeral 3) "III")))
  (testing "reduce 4 to IV"
    (is (= (reduce-to-numeral 4) "IV")))
  (testing "reduce 5 to V"
    (is (= (reduce-to-numeral 5) "V")))
  (testing "reduce 6 to VI"
    (is (= (reduce-to-numeral 6) "VI")))
  (testing "reduce 8 to VIII"
    (is (= (reduce-to-numeral 8) "VIII")))
  (testing "reduce 9 to IX"
    (is (= (reduce-to-numeral 9) "IX")))
  (testing "reduce 10 to X"
    (is (= (reduce-to-numeral 10) "X")))
  (testing "reduce 11 to XI"
    (is (= (reduce-to-numeral 11) "XI")))
  (testing "reduce 15 to XV"
    (is (= (reduce-to-numeral 15) "XV")))
  (testing "reduce 39 to XXXIX"
    (is (= (reduce-to-numeral 39) "XXXIX")))
  (testing "reduce 40 to XL"
    (is (= (reduce-to-numeral 40) "XL")))
  (testing "reduce 50 to L"
    (is (= (reduce-to-numeral 50) "L")))
  (testing "reduce 89 LXXXIX"
    (is (= (reduce-to-numeral 89) "LXXXIX")))
  (testing "reduce 90 XC"
    (is (= (reduce-to-numeral 90) "XC")))
  (testing "reduce 99 to XCIX"
    (is (= (reduce-to-numeral 99) "XCIX")))
  (testing "reduce 100 to C"
    (is (= (reduce-to-numeral 100) "C")))
  (testing "reduce 384 to CCCLXXXIV"
    (is (= (reduce-to-numeral 384) "CCCLXXXIV")))
  (testing "reduce 400 to CD"
    (is (= (reduce-to-numeral 400) "CD")))
  (testing "reduce 500 to D"
    (is (= (reduce-to-numeral 500) "D")))
  (testing "reduce 899 to DCCCXCIX"
    (is (= (reduce-to-numeral 899) "DCCCXCIX")))
  (testing "reduce 900 to CM"
    (is (= (reduce-to-numeral 900) "CM")))
  (testing "reduce 1000 to M"
    (is (= (reduce-to-numeral 1000) "M")))
  (testing "reduce 3999 to MMMCMXCIX"
    (is (= (reduce-to-numeral 3999) "MMMCMXCIX"))))

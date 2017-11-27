(ns playground
  (:require
    [clojure.string :as str]))

(defn clojure-function [args]
  (let [string   "multiline\nstring"
        regexp   #"regexp"
        number   100.000
        booleans [false true]
        keyword  ::the-keyword]
    ;; this is comment
    (if true
      (->> 
        (list [vector] {:map map} #{'set})))))

;; current line highlight

;; find highlights:
(def some-var)
(defonce another-var)

(def f 1)
(def f' 2)
(def *f* 3)

(defn f [] 1)
(defn f' [] 2)
(defn *f* [] 3)

(rum/defc comp [] [:div "a"])
 
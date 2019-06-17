(ns breakout.core.desktop-launcher
  (:require [breakout.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. breakout "breakout" 1500 750)
  (Keyboard/enableRepeatEvents true))

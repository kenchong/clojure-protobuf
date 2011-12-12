(defproject protobuf "0.5.0"
  :description "Clojure-protobuf provides a clojure interface to Google's protocol buffers."
  :dependencies [[clojure "1.2.0"]
                 [ordered-set "0.2.2"]
                 [useful "0.7.5"]]
  :test-dependencies [[gloss "0.2.0-rc1"]
                      [io "0.1.0"]]
  :cake-plugins [[cake-protobuf "0.5.0"]]
  :jar-files ["proto"])

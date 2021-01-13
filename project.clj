(defproject literate-example "0.1.0-SNAPSHOT"
  :description "Literate Example"
  :url "https://github.com/pedrorgirardi/literate-example"
  ;;
  :plugins [[reifyhealth/lein-git-down "0.3.5"]]
  :middleware [lein-git-down.plugin/inject-properties]
  :repositories [["public-github" {:url "git://github.com"
                                   :protocol :https}]]
  ;;
  :source-paths ["src/dev/clojure"]
  :resource-paths ["src/dev/resources"]
  ;;
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.json "1.0.0"]
                 [pedrorgirardi/literate.client
                  "0136b091c621f261d038c28ab5451d1073464a46"]
                 [pedrorgirardi/literate
                  "7f1fe48534ce1cb7a8e86df28a482425efb60c7e"]]
  :git-down {pedrorgirardi/literate.client
             {:coordinates pedrorgirardi/literate.client}
             pedrorgirardi/literate
             {:coordinates pedrorgirardi/literate}})

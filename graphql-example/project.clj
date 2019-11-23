(defproject graphql-example "0.1.0-SNAPSHOT"
  :description "FIXME: GraphQL API for graphql-example"
  :url "FIXME: https://github.com/fixme"
  
  :dependencies [[clojure-future-spec "1.9.0-alpha17"]
                 [com.stuartsierra/component "0.3.2"]
                 [com.walmartlabs/lacinia "0.20.0"]
                 [com.walmartlabs/lacinia-pedestal "0.3.0"]
                 [environ "1.1.0"]
                 [io.pedestal/pedestal.jetty "0.5.2"]
                 [io.pedestal/pedestal.log "0.5.2"]
                 [io.pedestal/pedestal.route "0.5.2"]
                 [io.pedestal/pedestal.service "0.5.2"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.namespace "0.2.11"]
                 [org.danielsz/system "0.4.0"]
                 [org.slf4j/slf4j-simple "1.7.21"]
                 [umlaut "0.1.14-SNAPSHOT"]]

  :plugins [[lein-environ "1.1.0"]
            [lein-umlaut "0.1.2-SNAPSHOT"]]

  :min-lein-version "2.6.1"

  ;; Starts server with a simple `lein run`
  :main ^:skip-aot graphql-example.application

  :uberjar-name "graphql-example.jar"
  
  :target-path "target/%s"

  ;; nREPL by default starts in the :main namespace, we want to start in `user`
  ;; because that's where our development helper functions like (go) and (reset)
  ;; live.
  :repl-options {:init-ns user}

  :bikeshed {:max-line-length 200}

  :profiles {:dev {:dependencies [[org.clojure/tools.nrepl "0.2.13"]
                                  [reloaded.repl "0.2.3"]]
                   :source-paths ["dev"]}
             :uberjar {:omit-source true
                       :aot :all}})

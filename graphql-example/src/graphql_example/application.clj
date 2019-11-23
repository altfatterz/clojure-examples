(ns graphql-example.application
    (:gen-class)
    (:require [com.stuartsierra.component :as component]
              [graphql-example.components.lacinia :as lacinia]
              [graphql-example.components.pedestal :as pedestal]
              [graphql-example.components.routes :as routes]
              [graphql-example.components.schema :as schema]
              [graphql-example.config :as config]
              [graphql-example.resolvers.core :as resolvers]))

(defn app-system [app-config]
  (component/system-map
   ;; Basic app configurations
   :app-config app-config
   :umlaut-file "schemas/hello.umlaut"

   ;; Routes to be added to the basic GraphQL routes
   :routes routes/routes

   ;; Map of GraphQL resolvers to be added to the schema
   :resolvers resolvers/resolvers
   
   ;; GraphQL schema and Lacinia itself
   :schema (component/using (schema/new-schema)
                            [:resolvers :umlaut-file])
   :lacinia (component/using (lacinia/new-lacinia)
                             [:schema :routes])

   ;; Pedestal configuration and initialization
   :service-map (component/using (pedestal/new-pedestal-service-map)
                                 {:app-config :app-config
                                  :base-service-map :lacinia})
   :pedestal (component/using (pedestal/new-pedestal)
                              [:service-map])))

(defn -main [& _]
  (-> (config/config)
      app-system
      component/start))

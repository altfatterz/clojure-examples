(ns graphql-example.resolvers.core
    (:require [graphql-example.resolvers.hello :as hello]))

(def resolvers {:resolver-hello hello/resolver})

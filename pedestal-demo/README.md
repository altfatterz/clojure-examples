```bash
$ clj

Downloading: io/pedestal/pedestal.service/0.5.7/pedestal.service-0.5.7.pom from https://repo.clojars.org/
Downloading: io/pedestal/pedestal.route/0.5.7/pedestal.route-0.5.7.pom from https://repo.clojars.org/
Downloading: io/pedestal/pedestal.jetty/0.5.7/pedestal.jetty-0.5.7.pom from https://repo.clojars.org/
Downloading: org/slf4j/slf4j-simple/1.7.28/slf4j-simple-1.7.28.pom from https://repo1.maven.org/maven2/
Downloading: org/slf4j/slf4j-parent/1.7.28/slf4j-parent-1.7.28.pom from https://repo1.maven.org/maven2/
Downloading: io/pedestal/pedestal.log/0.5.7/pedestal.log-0.5.7.pom from https://repo.clojars.org/
Downloading: io/pedestal/pedestal.interceptor/0.5.7/pedestal.interceptor-0.5.7.pom from https://repo.clojars.org/
Downloading: org/clojure/core.async/0.4.490/core.async-0.4.490.pom from https://repo1.maven.org/maven2/
Downloading: ring/ring-core/1.7.1/ring-core-1.7.1.pom from https://repo.clojars.org/
Downloading: cheshire/cheshire/5.8.1/cheshire-5.8.1.pom from https://repo.clojars.org/
Downloading: org/clojure/tools.analyzer.jvm/0.7.2/tools.analyzer.jvm-0.7.2.pom from https://repo1.maven.org/maven2/
Downloading: com/cognitect/transit-clj/0.8.313/transit-clj-0.8.313.pom from https://repo1.maven.org/maven2/
...
```

Running it:

```bash
user=> (require 'hello)
nil
user=> (hello/start)

[main] INFO org.eclipse.jetty.util.log - Logging initialized @36010ms to org.eclipse.jetty.util.log.Slf4jLog
[main] INFO org.eclipse.jetty.server.Server - jetty-9.4.18.v20190429; built: 2019-04-29T20:42:08.989Z; git: e1bc35120a6617ee3df052294e433f3a25ce7097; jvm 1.8.0_222-b10
[main] INFO org.eclipse.jetty.server.handler.ContextHandler - Started o.e.j.s.ServletContextHandler@e13cc49{/,null,AVAILABLE}
[main] INFO org.eclipse.jetty.server.AbstractConnector - Started ServerConnector@42ffa0c8{HTTP/1.1,[http/1.1, h2c]}{localhost:8890}
[main] INFO org.eclipse.jetty.server.Server - Started @36375ms
[qtp1081867337-17] INFO io.pedestal.http - {:msg "GET /greet", :line 80}
```

More details here:
http://pedestal.io/guides/hello-world

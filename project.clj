(defproject polvo/firestore-clj "1.2.1-SNAPSHOT"
  :description "A Firestore API for Clojure. Provides tools for doing single pulls and writes, streaming real-time data, batched writes and transactions."
  :url "https://github.com/polvotech/firestore-clj"
  :license {:name "MIT LICENSE"
            :url  "https://github.com/polvotech/firestore-clj/blob/master/LICENSE"}
  :scm {:name "git" :url "https://github.com/polvotech/firestore-clj"}
  :plugins [[lein-codox "0.10.7"]]
  :dependencies [[org.clojure/clojure "1.10.1" :scope "provided"]
                 [org.clojure/core.match "1.0.0"]
                 [com.google.firebase/firebase-admin "6.12.1"]
                 [manifold "0.1.8"]]
  :global-vars {*warn-on-reflection* true}
  :jar-exclusions [#"user\.clj"]
  :uberjar-exclusions [#"user\.clj"]
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"])

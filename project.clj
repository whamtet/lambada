(defproject uswitch/lambada "0.1.1"
  :description "The messy parts for running clojure on AWS Lambda."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.amazonaws/aws-lambda-java-core "1.1.0"]]
  :java-source-paths ["src-java"])

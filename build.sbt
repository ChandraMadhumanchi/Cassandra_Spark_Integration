
name := "Spark Cassandra Demo"

version := "0.1"

scalaVersion := "2.11.8"


libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.1.0" withSources() withJavadoc(),
  "org.apache.spark" %% "spark-sql" % "2.1.0" withSources() withJavadoc(),
  "org.apache.spark" %% "spark-streaming" % "2.1.0" withSources() withJavadoc(),
  "org.apache.spark" %% "spark-streaming-twitter" % "1.2.1" withSources() withJavadoc(),
  "com.datastax.spark" %% "spark-cassandra-connector" % "1.2.1" withSources() withJavadoc(),
  "com.github.nscala-time" %% "nscala-time" % "1.6.0" withSources() withJavadoc()
)


resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"
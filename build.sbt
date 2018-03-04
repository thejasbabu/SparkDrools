name := "Spark Drools"

version := "1.0"

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "2.3.0",
  "org.drools" % "drools-compiler" % "7.4.0.Final",
  "org.drools" % "drools-core" % "7.4.0.Final"
)
resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots")
)
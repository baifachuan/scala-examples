name := "scala-examples"
organization := "com.fcbai.demo"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.11.0"

lazy val root = project in file(".")
lazy val `graphql-examples` = project in file("graphql-examples")
lazy val `play-examples` = (project in file("play-examples")).enablePlugins(PlayScala)

libraryDependencies += "org.sangria-graphql" %% "sangria" % "2.0.1"

name := """play-examples"""
organization := "com.fcbai.play.demo"

version := "1.0-SNAPSHOT"

scalaVersion := "2.13.5"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.fcbai.play.demo.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.fcbai.play.demo.binders._"

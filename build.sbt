version := "1.0"
name := "employee-api"
organization := "com.empbook"

scalaVersion := "2.13.14"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test

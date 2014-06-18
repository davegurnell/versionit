scalaVersion := "2.11.0"

name := "versionator"

organization := "io.underscore"

version := "0.1"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.specs2" %% "specs2" % "2.3.12" % "test"
)
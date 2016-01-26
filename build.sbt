name         := "versionit"
organization := "com.davegurnell"
version      := "0.1.1"

scalaVersion := "2.11.7"

// Macros:

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

// Testing:

libraryDependencies += "org.specs2" %% "specs2" % "2.3.12" % "test"

// Bintray:

licenses += ("Apache-2.0", url("http://apache.org/licenses/LICENSE-2.0"))

bintrayPackageLabels in bintray := Seq("scala", "git", "utility")

bintrayRepository in bintray := "maven"

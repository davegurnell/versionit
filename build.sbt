scalaVersion := "2.11.0"

name := "versionit"

organization := "com.untyped"

version := "0.1"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.specs2" %% "specs2" % "2.3.12" % "test"
)

resolvers += Resolver.url("Untyped", url("http://ivy.untyped.com"))(Resolver.ivyStylePatterns)

publishTo := Some(Resolver.sftp("untyped", "ivy.untyped.com", "ivy.untyped.com/public/htdocs")(Resolver.ivyStylePatterns))

publishMavenStyle := false
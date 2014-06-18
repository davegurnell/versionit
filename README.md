versionit
=========

Scala macro to compile a Git version number into a release

Copyright 2014 Dave Gurnell

Licensed under the Apache 2.0 License

Installation
------------

Add the following to your `build.sbt`:

~~~ scala
resolvers += Resolver.url("untyped", url("http://ivy.untyped.com"))(Resolver.ivyStylePatterns)

libraryDependencies += "com.untyped" %% "versionit" % "0.1"
~~~

Usage
-----

`versionit.gitCommit` is a macro that expands to a string literal
containing the Git commit hash at it stands at compile time:

~~~ scala
val commit: String = versionit.gitCommit

println(commit) // prints e.g. "0123456789abcdef0123456789abcdef01234567"
~~~

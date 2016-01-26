versionit
=========

Scala macro to compile a Git version number into a release

Copyright 2014 Dave Gurnell

Licensed under the Apache 2.0 License

Installation
------------

Add the following to your `build.sbt`:

~~~ scala
resolvers += "Awesome Utilities" at "https://dl.bintray.com/davegurnell/maven"

libraryDependencies += "com.davegurnell" %% "versionit" % "0.1.0"
~~~

Usage
-----

`versionit.gitCommit` is a macro that expands to a string literal
containing the Git commit hash at it stands at compile time:

~~~ scala
val commit: String = versionit.gitCommit

println(commit) // prints e.g. "0123456789abcdef0123456789abcdef01234567"
~~~

versionit
=========

Scala macro to compile a Git version number into a release

Copyright 2014 Dave Gurnell

Licensed under the Apache 2.0 License

Usage
-----

`versionit.gitCommit` is a macro that expands to a string literal
containing the Git commit hash at it stands at compile time:

~~~ scala
val commit: String = versionit.gitCommit
println(commit)
~~~

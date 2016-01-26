package versionit

import org.specs2.mutable._

class VersionitSpec extends Specification {
  val gitCommitRegex = "^[a-z0-9]{40}$".r

  "gitCommit should return a correctly formatted string" >> {
    gitCommit must beMatching(gitCommitRegex)
  }
}
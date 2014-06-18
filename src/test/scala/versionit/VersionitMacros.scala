package versionit

import org.specs2.mutable._

class VersionitSpec extends Specification {
  "gitCommit should return a string" >> {
    gitCommit.isInstanceOf[String] mustEqual true
  }
}
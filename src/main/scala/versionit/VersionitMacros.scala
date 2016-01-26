package versionit

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

import scala.sys.process._

class VersionitMacros(val c: Context) {
  import c.universe._

  def gitCommit: c.Tree = {
    try {
      val commit = "git rev-parse HEAD".!!.trim
      q"$commit"
    } catch {
      case exn: Throwable =>
        c.abort(c.enclosingPosition, s"Error retrieving git commit: ${exn.getMessage}")
    }
  }
}

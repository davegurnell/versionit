import scala.language.experimental.macros

package object versionit {
  def gitCommit: String =
    macro VersionitMacros.gitCommit
}
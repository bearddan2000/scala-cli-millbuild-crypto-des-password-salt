import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object CLI extends ScalaModule {
    def scalaVersion = "2.13.1"

    def ivyDeps = Agg(
      ivy"commons-codec:commons-codec:1.15"
    )
}

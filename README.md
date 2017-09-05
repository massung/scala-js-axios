# ScalaJS Axios Facade

This is a [ScalaJS][scalajs] facade for [Axios][axios].

## Installing

**Step 1.** Add [JitPack][jitpack] to your repositories in [SBT][sbt]:

```scala
resolvers += "jitpack" at "https://jitpack.io"
```

**Step 2.** Add this repo as a dependency:

```scala
libraryDependencies += "blog.codeninja" % "scala-js-axios" % "0.16.1"
```

If you'd like the latest-and-greatest version, use "master-SNAPSHOT".

## Example Usage

Perform a simple HTTP get, wait for it, and print the response.

```scala
import scala.scalajs.js
import blog.codeninja.scalajs.axios._

object Example {
    def main(args: Array[String]) = {
        Axios.get("http://www.google.com", literal(
            data = js.Dictionary[String]("q" -> "scalajs")
        ))
    }
}
```

You should be ready to roll...

## That's It

If you find a bug or have suggestions on how to improve the facade (specifically adding some more type safety where possible), please open an issue and tell me about it.

Hope you find this helpful!

[scalajs]:      http://www.scala-js.org
[sbt]:          http://www.scala-sbt.org
[axios]:        https://github.com/mzabriskie/axios
[jitpack]:      https://jitpack.io

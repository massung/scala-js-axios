enablePlugins(ScalaJSPlugin)

// project name/version
name := "scala-js-axios"
version := "0.16.1"

// what version of scala to use
scalaVersion := "2.12.3"

// libraries
libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1"
)

// javascript sources
jsDependencies ++= Seq(
  "org.webjars.npm" % "axios" % "0.16.1" / "dist/axios.js" minified "dis/axios.min.js" commonJSName "Axios"
)

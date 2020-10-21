import Dependencies._

val circeVersion = "0.12.3"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

libraryDependencies +=
    "org.scalatest" %% "scalatest" % "3.2.0" % Test

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.jjmerelo",
      scalaVersion := "2.12.10",
      version      := "0.1.0"
    )),
    name := "Hitos",

  )

cancelable in Global := true

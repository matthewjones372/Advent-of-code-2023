ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.1"

lazy val root = (project in file("."))
  .settings(
    name := "adventOfCode"
  )

libraryDependencies ++= Seq(
  "dev.zio" %% "zio"         % "2.0.13",
  "dev.zio" %% "zio-streams" % "2.0.13",
  "dev.zio" %% "zio-prelude" % "1.0.0-RC16",
  "dev.zio" %% "zio-nio"     % "2.0.1",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.2.0"
)

ThisBuild / semanticdbEnabled := false

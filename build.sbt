ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "adventOfCode"
  )

libraryDependencies ++= Seq(
  "dev.zio"                %% "zio"                      % "2.0.19",
  "dev.zio"                %% "zio-test"                 % "2.0.19" % Test,
  "dev.zio"                %% "zio-test-sbt"             % "2.0.19" % Test,
  "dev.zio"                %% "zio-test-magnolia"        % "2.0.19" % Test,
  "dev.zio"                %% "zio-streams"              % "2.0.19",
  "dev.zio"                %% "zio-prelude"              % "1.0.0-RC21",
  "dev.zio"                %% "zio-nio"                  % "2.0.1",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.2.0"
)

testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
ThisBuild / semanticdbEnabled := false

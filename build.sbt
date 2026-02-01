scalaVersion := "2.13.15"

name := "scala-github-actions-demo"
version := "0.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.19" % Test
)

// Correct sbt 1.x syntax for JUnit XML
Test / testOptions += Tests.Argument(
  TestFrameworks.ScalaTest,
  "-u",
  "target/test-reports"
)

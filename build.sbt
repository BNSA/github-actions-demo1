ThisBuild / scalaVersion := "2.13.15"

ThisBuild / organization := "com.example"
ThisBuild / version := "0.1.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.18" % Test

Test / testOptions += Tests.Argument(
  TestFrameworks.ScalaTest,
  "-u",
  (Test / target).value / "test-reports"
)

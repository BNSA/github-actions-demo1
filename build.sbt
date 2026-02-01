ThisBuild / scalaVersion := "2.13.15"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.18" % Test

Test / testOptions := Seq(
  Tests.Argument(
    TestFrameworks.ScalaTest,
    "-oD",
    "-u", "target/test-reports"
  )
)

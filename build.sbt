scalaVersion := "2.13.15"  // Default – overridden by matrix in workflow

name := "scala-github-actions-demo"
version := "0.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.19" % Test
)

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/test-reports")  // Generates JUnit XML reports

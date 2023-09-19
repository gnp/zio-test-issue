ThisBuild / scalaVersion := "2.13.12"

ThisBuild / organization := "com.gregorpurdy"
ThisBuild / version := "0.1.0-SNAPSHOT"

// val ZioVersion = "2.0.15" // Correct "sbt test" output with this version
val ZioVersion = "2.0.16" // Incorrect "sbt test" output with this version

lazy val root = (project in file("."))
  .settings(
    name := "zio-test-issue",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % ZioVersion,
      "dev.zio" %% "zio-test" % ZioVersion,
      "dev.zio" %% "zio-test-magnolia" % ZioVersion,
      "dev.zio" %% "zio-test-sbt" % ZioVersion
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )

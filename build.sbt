name := "scalaziotest"

version := "1.0"

scalaVersion := "2.12.1"

// Packages
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

mainClass in Compile := Some("scalaziotest.Main")

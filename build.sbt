name := "scalaziotest"

version := "1.0"

scalaVersion := "2.12.6"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

// Packages
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

libraryDependencies += "org.scalaz" %% "scalaz-zio" % "a2c2c8ba-SNAPSHOT"

mainClass in Compile := Some("scalaziotest.Main")

trapExit := false

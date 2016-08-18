name := """play-scala-intro"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "2.0.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "2.0.0",
  "com.h2database" % "h2" % "1.4.190",
  "joda-time" % "joda-time" % "2.9.4",
  "org.json4s" % "json4s-jackson_2.11" % "3.2.11",
  specs2 % Test,
  ws
)

fork in run := true
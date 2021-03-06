import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Scala Seed Project",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.22",
    libraryDependencies += "org.scalaz" %% "scalaz-effect" % "7.2.22",
    libraryDependencies += "org.typelevel" %% "cats-effect" % "1.0.0-RC"
)

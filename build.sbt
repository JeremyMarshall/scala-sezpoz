scalaVersion := "2.11.2"

val scalazVersion = "7.1.0"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % scalazVersion,
  "org.scalaz" %% "scalaz-effect" % scalazVersion,
  "org.scalaz" %% "scalaz-typelevel" % scalazVersion,
  "org.scalaz" %% "scalaz-scalacheck-binding" % scalazVersion % "test"
)
libraryDependencies += "net.java.sezpoz" % "sezpoz" % "1.11"

scalacOptions += "-feature"
//javacOptions += "-proc:none"

initialCommands in console := "import scalaz._, Scalaz._"

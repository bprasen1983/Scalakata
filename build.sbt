name := "ScalaKata"

version := "1.0"


val versions = new{
  val scala = "2.11.8"
  val scalatest = "3.0.1"
  val mockito = "1.10.19"
}

scalaVersion := versions.scala

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % versions.scalatest % "test"
)
        
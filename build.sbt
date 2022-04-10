name := "scala-md-tag"

version := "0.3.5"

organization := "io.github.alexyavo"

// scala versions and options

scalaVersion := "2.13.8"

pgpPassphrase := Some(sys.env.getOrElse("GPG_PASSWORD", default = "").toArray)

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-Xverify",
  "-encoding", "UTF-8",
  "-feature",
  "-language:postfixOps"
)

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")

// dependencies

libraryDependencies ++= Seq (
  "org.scalatest"  %% "scalatest" % "3.0.8"  % Test
)

resolvers ++= Seq(Resolver.sonatypeRepo("public"))


sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
sonatypeCredentialHost := "s01.oss.sonatype.org"

// Your profile name of the sonatype account. The default is the same with the organization value
publishMavenStyle := true

publishArtifact in Test := false

sonatypeProfileName := "io.github.alexyavo"

pomIncludeRepository := { _ => false }

pgpPassphrase := Some(sys.env.getOrElse("GPG_PASSWORD", default = "").toArray)

scmInfo := Some(
  ScmInfo(
    url("https://github.com/alexyavo/scala-md-tag"),
    "scm:git@github.alexyavo/scala-md-tag.git"
  )
)

import xerial.sbt.Sonatype._

sonatypeProjectHosting := Some(GitHubHosting(user="alexyavo", repository="scala-md-tag", email="alxndr.yav@gmail.com"))

licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))

developers := List(
  Developer(id = "alexyavo", name = "Alex Y", url = url("https://github.com/alexyavo"), email="alxndr.yav@gmail.com")
)

publishTo := sonatypePublishToBundle.value

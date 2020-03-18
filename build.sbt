val CATS_VERSION = "2.0.0"
val HTTP4S_VERSION = "0.21.0-SNAPSHOT"
val AKKA_HTTP_VERSION = "10.1.10"
val AKKA_STREAM_VERSION = "2.5.23"
val PURE_CONFIG_VERSION = "0.12.1"
val REFINED_VERSION = "0.9.10"
val SCALA_TEST_VERSION = "3.1.0"
val SCALA_CHECK_VERSION = "1.14.3"
val SCALA_CHECK_PLUS_VERSION = "3.1.0.0-RC2"
val CIRCE_VERSION = "0.12.3"
val AKKA_HTTP_CIRCE = "1.29.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "depop",
    version := "1.0",
    scalaVersion := "2.13.1",
    scalacOptions ++= Seq("-Ymacro-annotations"),
    resolvers += Resolver.sonatypeRepo("snapshots"),
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % CATS_VERSION,
      "org.typelevel" %% "cats-effect" % CATS_VERSION,
      "org.http4s" %% "http4s-dsl" % HTTP4S_VERSION,
      "org.http4s" %% "http4s-circe" % HTTP4S_VERSION,
      "org.http4s" %% "http4s-blaze-server" % HTTP4S_VERSION,
      "org.http4s" %% "http4s-blaze-client" % HTTP4S_VERSION,
      "com.github.pureconfig" %% "pureconfig" % PURE_CONFIG_VERSION,
      "com.typesafe.akka" %% "akka-http" % AKKA_HTTP_VERSION,
      "com.typesafe.akka" %% "akka-stream" % AKKA_STREAM_VERSION,
      "eu.timepit" %% "refined" % REFINED_VERSION,
      "de.heikoseeberger" %% "akka-http-circe" % AKKA_HTTP_CIRCE,
//Test
      "org.scalatest" %% "scalatest" % SCALA_TEST_VERSION % Test,
      "org.scalacheck" %% "scalacheck" % SCALA_CHECK_VERSION % Test,
      "org.scalatestplus" %% "scalatestplus-scalacheck" % SCALA_CHECK_PLUS_VERSION % Test
    ) ++ Seq(
      "io.circe" %% "circe-core",
      "io.circe" %% "circe-generic",
      "io.circe" %% "circe-parser",
      "io.circe" %% "circe-refined"
    ).map(_ % CIRCE_VERSION)
  )

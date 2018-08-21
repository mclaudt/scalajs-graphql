import sbt.Def.{setting => s}

// scalastyle:off underscore.import
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt._
// scalastyle:on underscore.import

// scalastyle:off line.size.limit multiple.string.literals

trait DependencyImports {

  // Alphabetical order (case insensitive)

  object Versions {
    val CaseApp = "1.2.0-M4"
    val Cats = "1.0.0-RC1"
    val CatsEffect = "0.5"
    val Circe = "0.9.0-M2"
    val Http4s = "0.17.5"
    val Sangria = "1.3.2"
    val SangriaCirce = "1.1.0"
    val Scalajs = "0.6.20"
//    val ScalajsReact = "1.1.1"
    val ScalajsReact = "1.2.3"
    val ScalaMacrosParadise = "2.1.1"
    val Scalameta = "2.1.2"
    val ScalaTest = "3.0.4"
    val Slf4j = "1.7.25"
  }

  object Dependencies {

    private val v = Versions

    val CaseApp = s("com.github.alexarchambault" %% "case-app" % v.CaseApp)
    val CatsCore = s("org.typelevel" %%% "cats-core" % v.Cats)
    val CatsEffect = s("org.typelevel" %%% "cats-effect" % v.CatsEffect)
    val CirceGeneric = s("io.circe" %%% "circe-generic" % v.Circe)
    val CirceParser = s("io.circe" %%% "circe-parser" % v.Circe)
    val CirceScalajs = s("io.circe" %%% "circe-scalajs" % v.Circe)
    val Http4sClient = s("org.http4s" %% "http4s-blaze-client" % v.Http4s)
    val Sangria = s("org.sangria-graphql" %% "sangria" % v.Sangria)
    val Scalajs = s("org.scala-js" % "sbt-scalajs" % v.Scalajs)
    val Scalameta = s("org.scalameta" %% "scalameta" % v.Scalameta)
    val ScalaTest = s("org.scalatest" %%% "scalatest" % v.ScalaTest)
    val Slf4jNop = s("org.slf4j" % "slf4j-nop" % v.Slf4j)

    // format: off
    val SangriaCirce = s("org.sangria-graphql" %% "sangria-circe" % v.SangriaCirce)
    val ScalajsReactCore = s("com.github.japgolly.scalajs-react" %%% "core" % v.ScalajsReact)
    val ScalaMacrosParadise = s("org.scalamacros" % "paradise" % v.ScalaMacrosParadise cross CrossVersion.full)
    // format: on
  }

  object NpmVersions {
    val ApolloCache = "1.0.0"
    val ApolloCacheInmemory = "1.0.0"
    val ApolloClient = "2.0.1"
    val ApolloLink = "1.0.0"
    val ApolloLinkHttp = "1.1.0"
    val NodeFetch = "1.7.3"
    val Graphql = "0.11.7"
    val GraphqlTag = "2.5.0"
    val GraphqlTools = "2.7.2"
    val React = "15.6.2"
    val ReactApollo = "2.0.0"
  }

  object NpmDependencies {

    private type T = (String, String)
    private val v = NpmVersions

    val ApolloCache: T = "apollo-cache" -> v.ApolloCache
    val ApolloClient: T = "apollo-client" -> v.ApolloClient
    val ApolloLink: T = "apollo-link" -> v.ApolloLink
    val ApolloLinkHttp: T = "apollo-link-http" -> v.ApolloLinkHttp
    val NodeFetch: T = "node-fetch" -> v.NodeFetch
    val Graphql: T = "graphql" -> v.Graphql
    val GraphqlTag: T = "graphql-tag" -> v.GraphqlTag
    val GraphqlTools: T = "graphql-tools" -> v.GraphqlTools
    val React: T = "react" -> v.React
    val ReactApollo: T = "react-apollo" -> v.ReactApollo
    val ReactDom: T = "react-dom" -> v.React

    // format: off
    val ApolloCacheInmemory: T = "apollo-cache-inmemory" -> v.ApolloCacheInmemory
    // format: on
  }
}

// Copyright (C) 2017 Anduin Transactions, Inc.

lazy val `scalajs-noton-core` = project
  .in(file("noton-core"))
  .enablePlugins(ScalaJSPlugin)

lazy val `scalajs-noton-generic` = project
  .in(file("noton-generic"))
  .dependsOn(`scalajs-noton-core`)
  .settings(
    scalaJSUseMainModuleInitializer in Test := true
  )
  .enablePlugins(ScalaJSPlugin)

lazy val noton = project
  .in(file("."))
  .aggregate(
    `scalajs-noton-core`,
    `scalajs-noton-generic`
  )

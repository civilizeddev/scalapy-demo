ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / organization     := "io.elfinos"
ThisBuild / organizationName := "UNOMIC"
ThisBuild / javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

name := "scalapy-demo"

libraryDependencies += "ch.qos.logback"            % "logback-classic" % "1.2.3"
libraryDependencies += "me.shadaj"                %% "scalapy-core"    % "0.5.0"
libraryDependencies += "com.softwaremill.macwire" %% "macros"          % "2.3.7"  % Provided
libraryDependencies += "com.softwaremill.macwire" %% "util"            % "2.3.7"
libraryDependencies += "com.softwaremill.macwire" %% "proxy"           % "2.3.7"
libraryDependencies += "org.scalameta"            %% "munit"           % "0.7.27" % Test

// https://scalapy.dev/docs/#installation

fork := true

import scala.sys.process._

javaOptions += s"-Djna.library.path=${"python3-config --prefix".!!.trim}/lib"

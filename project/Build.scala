import sbt._
import Keys._

object MainBuild extends Build {
    lazy val root = Project(id = "main",
                            base = file(".")) aggregate(scrooge) dependsOn(scrooge)

    lazy val scrooge = Project(id = "main-scrooge",
                           base = file("main-scrooge"))
}
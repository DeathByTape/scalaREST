name := "scalaREST"

version := "1.0"

scalaVersion := "2.11.4"

// Specify container we're building for
jetty()

projectDependencies ++= Seq(
  "org.glassfish.jersey.containers" % "jersey-container-servlet" % "2.13",
  "javax.ws.rs" % "javax.ws.rs-api" % "2.0.1"
)

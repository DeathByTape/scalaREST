scalaREST
=========

scalaREST is a simple scaffolding example on using a tech stack consisting of Jetty (or anything deploying war files) with
JAX-RS + Jersey + Servlet 3.0 (i.e. descriptor-less) with scala as the backing language.
See http://deathbytape.com/

Compile
=======

```bash
sbt clean package
```

Usage
=====

Copy the compiled .war file to your Jetty server's "webapps" directory. Then start Jetty:

```bash
java -jar start.jar
```

If running on localhost, you can view an example here:
http://localhost:8080/scalarest_2.11-1.0/hello/YourName

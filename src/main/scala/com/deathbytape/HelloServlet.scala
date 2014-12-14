/*
 * Copyright (C) 2014 Dennis J. McWherter, Jr.
 *
 * This software may be modified and distributed under the terms of the MIT License.
 */
package com.deathbytape

import javax.ws.rs.{PathParam, Produces, GET, Path}
import javax.ws.rs.core.{MediaType, Response}

/**
 * Servlet to serve a little interactive HelloWorld for RESTful API
 */
@Path("/hello")
class HelloServlet {
  @GET
  @Path("{name}")
  @Produces(Array(MediaType.TEXT_HTML))
  def helloName(@PathParam("name") name: String): Response = {
    name match {
      case x if x != null => Response.status(200).entity("Hello Sir/Madam, " + x).build()
      case _ => Response.status(200).entity("Please input a name (as PathParam)!").build()
    }
  }
}

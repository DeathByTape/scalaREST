/*
 * Copyright (C) 2014 Dennis J. McWherter, Jr.
 *
 * This software may be modified and distributed under the terms of the MIT License.
 */
package com.deathbytape

import javax.ws.rs.ApplicationPath

import org.glassfish.jersey.server.ResourceConfig

/**
 * Application to setup servlets
 */
@ApplicationPath("/")
class HelloApp extends ResourceConfig {
  packages("com.deathbytape")
}

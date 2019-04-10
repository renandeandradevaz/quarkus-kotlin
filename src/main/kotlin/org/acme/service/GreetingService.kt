package org.acme.service

import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@ApplicationScoped
open class GreetingService{

    @Inject
    lateinit var greetingService2: GreetingService2

    fun hello() = greetingService2.hello()
}
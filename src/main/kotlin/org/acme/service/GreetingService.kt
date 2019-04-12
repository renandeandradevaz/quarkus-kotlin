package org.acme.service

import javax.inject.Singleton

@Singleton
open class GreetingService constructor(val greetingService2: GreetingService2) {

	fun hello() = greetingService2.hello()
}
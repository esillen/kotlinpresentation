package io.github.esillen.plugins

import io.github.esillen.routes.userRouting
import io.ktor.server.plugins.swagger.*
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureHTTP() {
    routing {
        get("/") {
            call.respondText ("Hello")
        }
        userRouting()
        //swaggerUI(path = "openapi")
    }
}

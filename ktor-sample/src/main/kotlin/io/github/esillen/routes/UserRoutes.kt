package io.github.esillen.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.userRouting() {
    route("/user") {
        get {
            call.respondText("user!")
        }
        get("{id?}") {
            call.respondText("user ${call.parameters["id"]}")
        }
        post {

        }
        delete("{id?}") {

        }
    }
}
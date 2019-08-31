package io.esuau.micronaut.controllers

import groovy.transform.CompileStatic
import io.esuau.micronaut.models.Status
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@CompileStatic
@Controller("/status")
class StatusController {

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    Status status() {
        return new Status("microservicedeploy", "0.1", "UP AND RUNNING")
    }

}

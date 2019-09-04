package io.esuau.controllers

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class StatusControllerSpec extends Specification {

    @Inject
    @Client("/")
    RxHttpClient client

    void "test status response"() {
        when:
        HttpRequest request = HttpRequest.GET('/status')
        String rsp = client.toBlocking().retrieve(request)

        then:
        rsp == """{"name":"microservicedeploy","version":"0.1","state":"UP AND RUNNING"}"""
    }

}

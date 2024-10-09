package com.lightningtalk.mutationtesting.service

import com.lightningtalk.mutationtesting.client.ExampleClient
import com.lightningtalk.mutationtesting.mapper.ExampleMapper
import spock.lang.Specification

class ExampleServiceBadTests extends Specification {
    ExampleClient exampleClient
    ExampleMapper exampleMapper
    ExampleService exampleService

    def setup() {
        exampleClient = Mock()
        exampleMapper = Mock()
        exampleService = new ExampleService(exampleClient, exampleMapper)
    }

    def "bad test 1"() {
        given:

        when:
        exampleService.exampleFunction(1)

        then:
        1 * exampleClient.callApi(_)
        1 * exampleMapper.map(_)
        true
    }

    def "leo is my favorite cat"() {
        given:
        def mapperReturn = 1

        when:
        def result = exampleService.exampleFunction(1)

        then:
        1 * exampleClient.callApi(_)
        1 * exampleMapper.map(_) >> mapperReturn
        result == mapperReturn
    }
}

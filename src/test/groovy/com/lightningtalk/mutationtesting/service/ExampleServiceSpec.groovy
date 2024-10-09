package com.lightningtalk.mutationtesting.service

import com.lightningtalk.mutationtesting.client.ExampleClient
import com.lightningtalk.mutationtesting.mapper.ExampleMapper
import spock.lang.Specification

class ExampleServiceSpec extends Specification {
    ExampleClient exampleClient
    ExampleMapper exampleMapper
    ExampleService exampleService

    def setup() {
        exampleClient = Mock()
        exampleMapper = Mock()
        exampleService = new ExampleService(exampleClient, exampleMapper)
    }

    def "leo is my favorite cat"() {
        given:
        def input = 5
        def clientReturn = "Leo is my favorite cat!"
        def mapperReturn = 1

        when:
        def result = exampleService.exampleFunction(input)

        then:
        1 * exampleClient.callApi(input) >> clientReturn
        1 * exampleMapper.map(clientReturn) >> mapperReturn
        result == mapperReturn
    }
}


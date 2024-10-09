package com.lightningtalk.mutationtesting.service;

import com.lightningtalk.mutationtesting.client.ExampleClient;
import com.lightningtalk.mutationtesting.mapper.ExampleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleService {
    private final ExampleClient exampleClient;
    private final ExampleMapper exampleMapper;
    public Integer exampleFunction(Integer input) {
        var clientReturn = exampleClient.callApi(input);
        return exampleMapper.map(clientReturn);
    }
}

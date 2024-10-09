package com.lightningtalk.mutationtesting.uitl;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
@Data
public class ExampleUtil {
    public Integer getMultiplicationFactor(Integer input) {
        return input * 2;
    }

    public void exampleUtilFunctionTwo() {
        //do stuff
    }
}

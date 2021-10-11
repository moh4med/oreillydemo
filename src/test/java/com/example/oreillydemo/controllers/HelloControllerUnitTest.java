package com.example.oreillydemo.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerUnitTest {
    @Test
    void name() {
        HelloController helloController = new HelloController();
        BindingAwareModelMap model = new BindingAwareModelMap();
        String result = helloController.sayHello("Why", model);
        assertEquals("hello",result);
        assertEquals("Why",model.asMap().get("user"));
    }
}

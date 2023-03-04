package com.dev.sen.greeting.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GreetingControllerTest {

    private GreetingController greetingController;
    @BeforeEach
    public void setup() {
        greetingController = new GreetingController();
    }

    @Test
    void shouldSendAGreetingWhenInvoked() {
        String greeting = greetingController.sayHello("Senthil");
        assertThat(greeting).isEqualTo("Hello Senthil!");
    }
}
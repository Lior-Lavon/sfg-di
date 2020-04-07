package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ContractorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {

        constructorInjectedController = new ConstructorInjectedController(new ContractorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}
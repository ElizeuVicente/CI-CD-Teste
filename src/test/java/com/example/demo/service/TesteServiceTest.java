package com.example.demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteServiceTest {

    @Test
    public void testHelloWord() {
        // Arrange
        TesteService service = new TesteService();

        // Act
        String resultado = service.helloWord();

        // Assert
        assertEquals("Teste PipeLine", resultado);
    }
}

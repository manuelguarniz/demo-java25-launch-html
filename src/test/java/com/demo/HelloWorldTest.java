package com.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para HelloWorld.
 */
@DisplayName("HelloWorld Tests")
class HelloWorldTest {

    @Test
    @DisplayName("Debe retornar el mensaje de bienvenida correcto")
    void testObtenerMensaje() {
        var helloWorld = new HelloWorld();
        String mensaje = helloWorld.obtenerMensaje();

        assertNotNull(mensaje, "El mensaje no debe ser nulo");
        assertEquals("Hello, World! — Java 25 con Maven", mensaje,
                "El mensaje debe ser exactamente el esperado");
    }

    @Test
    @DisplayName("El mensaje debe contener 'Hello'")
    void testMensajeContieneHello() {
        var helloWorld = new HelloWorld();

        assertTrue(helloWorld.obtenerMensaje().contains("Hello"),
                "El mensaje debe contener la palabra 'Hello'");
    }

    @Test
    @DisplayName("El mensaje debe contener 'Java 25'")
    void testMensajeContieneJava25() {
        var helloWorld = new HelloWorld();

        assertTrue(helloWorld.obtenerMensaje().contains("Java 25"),
                "El mensaje debe indicar la versión de Java");
    }
}

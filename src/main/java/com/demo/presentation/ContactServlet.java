package com.demo.presentation;

import com.demo.domain.ContactoRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.stream.Collectors;

public class ContactServlet extends HttpServlet {
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        try {
//            // Leer el cuerpo del JSON recibido
//            String jsonBody = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
//
//            // Aquí deberías parsear el JSON (ej. usando Jackson o tu HelperUtil)
//            // Ejemplo: ContactRequest data = HelperUtil.fromJson(jsonBody, ContactRequest.class);
//
//            System.out.println("Datos recibidos: " + jsonBody);

            // Convierte el JSON directamente a tu objeto Java
            ContactoRequest data = mapper.readValue(req.getInputStream(), ContactoRequest.class);

            // Ahora puedes usar los datos de forma segura
            System.out.println("Nombre recibido: " + data.nombre);

            // Preparar respuesta exitosa
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.getWriter().write("{\"status\": \"OK\", \"message\": \"Contacto recibido exitosamente\"}");

        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().write("{\"status\": \"NOK\", \"error\": \"Error al procesar el JSON\"}");
        }
    }
}

package com.demo.domain;

public class ContactoRequest {
    public String nombre;
    public String correo;
    public String mensaje;

    // Jackson requiere un constructor vacío
    public ContactoRequest() {}
}

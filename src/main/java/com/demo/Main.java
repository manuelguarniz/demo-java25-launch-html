package com.demo;

import com.demo.presentation.ServerController;

/**
 * Punto de entrada principal.
 * Inicia el servidor Tomcat embebido en el puerto 8080.
 */
public class Main {

  public static void main(String[] args) throws Exception {
    var server = new ServerController();
    server.start();
  }
}

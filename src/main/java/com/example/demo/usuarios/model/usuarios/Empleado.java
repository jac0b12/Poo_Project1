package com.example.demo.usuarios.model.usuarios;

import com.example.demo.usuarios.model.core.Persona;

public abstract class Empleado extends Persona {
    private String usuario;
    private String clave;
    private boolean activo;

    public Empleado(String nombre, int documento, int edad, String usuario, String clave) {
        super(nombre, documento, edad);
        this.usuario = usuario;
        this.clave = clave;
        this.activo = false;
    }
}

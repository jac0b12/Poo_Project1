package com.example.demo.usuarios.model.core;

public abstract class Persona {
    private int id;
    private String nombre;
    private int documento;
    private int edad;

    private String telefono;

    public Persona(String nombre, int documento, int edad) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.telefono = telefono;
    }


    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }
}

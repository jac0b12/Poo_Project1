package com.example.demo.usuarios.model;

public abstract class Usuario {

    private String nombre;
    private int documento;
    private int edad;
    private String telefono;

    public Usuario(String nombre, int documento, int edad, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.telefono = telefono;
    }

    public abstract void mostrarInformacion();

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

package com.example.demo.usuarios.model.usuarios;

import com.example.demo.usuarios.model.solicitudes.Solicitud;
import com.example.demo.usuarios.model.core.Persona;

import java.util.ArrayList;
import java.util.List;

public class Ciudadano extends Persona {
    private String telefono;
    private List<Solicitud> solicitud;


    public Ciudadano(String nombre, int documento, int edad, String telefono) {
        super(nombre, documento, edad);
        this.telefono = telefono;
        this.solicitud = new ArrayList<>();
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

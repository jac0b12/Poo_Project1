package com.example.demo.usuarios.model;

public class Ciudadano extends Usuario {

    private String tipoUsuario;
    private boolean prioritario;

    public Ciudadano(String nombre, int documento, int edad, String telefono,
                     String tipoUsuario, boolean prioritario) {

        super(nombre, documento, edad, telefono);

        this.tipoUsuario = tipoUsuario;
        this.prioritario = prioritario;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Edad: " + getEdad());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Tipo de usuario: " + tipoUsuario);
        System.out.println("Prioritario: " + prioritario);
    }

    public Solicitud crearSolicitud(String nomSolicitud, String tipoTramite) {

        Solicitud solicitud = new Solicitud(this, nomSolicitud, tipoTramite);

        return solicitud;
    }
}

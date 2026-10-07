package com.example.demo.usuarios.model;

public class Solicitud {

    private Ciudadano ciudadano;
    private int numSolicitud;
    private String nomSolicitud;
    private String tipoTramite;
    private String motivo;

    private static int contador = 0;

    public Solicitud(Ciudadano ciudadano, String nomSolicitud, String tipoTramite) {

        this.ciudadano = ciudadano;
        this.numSolicitud = 0;
        this.nomSolicitud = nomSolicitud;
        this.tipoTramite = tipoTramite;
    }

    public void registrar() {

        contador++;
        numSolicitud = contador;

        System.out.println("Solicitud: " + numSolicitud
                + " registrada para: " + ciudadano.getNombre());
    }

    public void setTipoTramite(String tipo) {
        this.tipoTramite = tipo;
    }

    public void Motivo(String motivo) {
        this.motivo = motivo;
    }
}

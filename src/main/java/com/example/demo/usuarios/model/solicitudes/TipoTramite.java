package com.example.demo.usuarios.model.solicitudes;

public class TipoTramite {
    private int id;
    private String nombre;
    private int tiempoEstimadoMin;
    private Solicitud solicitud;


    public TipoTramite(String nombre,int tiempoEstimadoMin){
        this.nombre = nombre;
        this.tiempoEstimadoMin = tiempoEstimadoMin;

    }

    //poner get y set
}

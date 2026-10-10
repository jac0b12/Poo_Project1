package com.example.demo.usuarios.model.solicitudes;

public class TipoTramite {
    private int id;
    private String nombre;
    private int tiempoEstimadoMin;


    public TipoTramite(int id ,String nombre,int tiempoEstimadoMin){
        this.id = id;
        this.nombre = nombre;
        this.tiempoEstimadoMin = tiempoEstimadoMin;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoEstimadoMin() {
        return tiempoEstimadoMin;
    }
    public void setTiempoEstimadoMin(int tiempoEstimadoMin) {
        this.tiempoEstimadoMin = tiempoEstimadoMin;
    }
}

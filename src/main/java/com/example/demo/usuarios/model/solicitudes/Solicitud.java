package com.example.demo.usuarios.model.solicitudes;

import com.example.demo.usuarios.model.usuarios.Ciudadano;

import java.time.LocalDateTime;

public class Solicitud {

    private int id;
    private LocalDateTime fechaRegistro;
    private String motivo;
    private TipoTramite tipoTramite;


    public Solicitud(int id,TipoTramite tipoTramite , String motivo, LocalDateTime fechaRegistro) {
        this.id = id;
        this.motivo = motivo;
        this.fechaRegistro = LocalDateTime.now();
        this.tipoTramite = tipoTramite;
    }




    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public TipoTramite getTipoTramite() {
        return tipoTramite;
    }
    public void setTipoTramite(TipoTramite tipoTramite) {
        this.tipoTramite = tipoTramite;
    }
}

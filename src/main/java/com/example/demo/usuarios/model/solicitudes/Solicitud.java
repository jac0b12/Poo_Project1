package com.example.demo.usuarios.model.solicitudes;

import com.example.demo.usuarios.model.usuarios.Ciudadano;

import java.time.LocalDateTime;

public class Solicitud {

    private Ciudadano ciudadano;
    private int id;
    private LocalDateTime fechaRegistro;
    private String motivo;



    public Solicitud(Ciudadano ciudadano, String motivo, LocalDateTime fechaRegistro) {
        this.motivo = motivo;
        this.ciudadano = ciudadano;
        this.fechaRegistro = LocalDateTime.now();
    }


    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    //poner get y set
}

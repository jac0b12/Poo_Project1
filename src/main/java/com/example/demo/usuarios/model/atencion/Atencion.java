package com.example.demo.usuarios.model.atencion;


import java.time.LocalDateTime;

public class Atencion {
    private int id;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;
    private String observaciones;
    private ResultadoAtencion resultado;


    public Atencion(int id, LocalDateTime horaInicio, LocalDateTime horaFin, String observaciones, ResultadoAtencion resultado){
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.observaciones = observaciones;
        this.resultado = resultado;
    }
}

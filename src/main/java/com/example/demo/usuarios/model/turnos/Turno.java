package com.example.demo.usuarios.model.turnos;

import com.example.demo.usuarios.model.usuarios.Asesor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Turno {
    private String numero;
    private Prioridad prioridad;
    private EstadoTurno estado;
    private LocalDateTime fechaLlamado;
    private LocalDateTime fechaGeneracion;

    public Turno(String numero, Prioridad prioridad, EstadoTurno estado, LocalDateTime fechaLlamado, LocalDateTime fechaGeneracion){
        this.numero = numero;
        this.prioridad = prioridad;
        this.estado = estado;
        this.fechaLlamado = fechaLlamado;
        this.fechaGeneracion = fechaGeneracion;
    }

    public class llamar(Asesor asesor){

    }

}

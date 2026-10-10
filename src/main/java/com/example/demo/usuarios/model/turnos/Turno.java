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

    public void llamar(Asesor asesor){
        estado = EstadoTurno.LLAMADO;
        this.fechaLlamado = LocalDateTime.now();
    }
    public void cancelar(Asesor asesor){
        estado = EstadoTurno.CANCELADO;
    }
    public void marcarNoAtendido(Asesor asesor){
        estado = EstadoTurno.NO_ATENDIDO;
    }


    //getts
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public Prioridad getPrioridad() { return prioridad; }
    public void setPrioridad(Prioridad prioridad) { this.prioridad = prioridad; }

    public EstadoTurno getEstado() { return estado; }
    public void setEstado(EstadoTurno estado) { this.estado = estado; }

    public LocalDateTime getFechaGeneracion() { return fechaGeneracion; }
    public void setFechaGeneracion(LocalDateTime fechaGeneracion) { this.fechaGeneracion = fechaGeneracion; }

    public LocalDateTime getFechaLlamado() { return fechaLlamado; }
    public void setFechaLlamado(LocalDateTime fechaLlamado) { this.fechaLlamado = fechaLlamado; }

}

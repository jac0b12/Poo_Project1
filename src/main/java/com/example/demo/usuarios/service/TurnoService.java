package com.example.demo.usuarios.service;
import com.example.demo.usuarios.exception.TurnoYaAtendidoException;
import com.example.demo.usuarios.model.turnos.EstadoTurno;
import com.example.demo.usuarios.model.turnos.Prioridad;
import com.example.demo.usuarios.model.turnos.Turno;
import com.example.demo.usuarios.model.solicitudes.Solicitud;
import com.example.demo.usuarios.model.usuarios.Asesor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Service
public class TurnoService {
    private Turno turno;
    private List<Turno> listaTurnos = new ArrayList<>();
    private EstadoTurno estado;




    public Turno generarTurno(Solicitud solicitud, Prioridad prioridad) throws TurnoYaAtendidoException {
        if (solicitud == null) {
            throw new IllegalArgumentException("La solicitud no puede ser nula para generar un turno.");
        }

        if(turno.getEstado() == EstadoTurno.EN_ATENCION){
            throw new TurnoYaAtendidoException("El espacio ya esta reservado");
        }

        String numeroTurno = "T-" + (listaTurnos.size() + 1);
        Turno nuevoTurno = new Turno(numeroTurno, prioridad, EstadoTurno.EN_ESPERA, LocalDateTime.now(), null);

        listaTurnos.add(nuevoTurno);
        return nuevoTurno;
    }

    public void cancelarTurno(String numeroTurno) {
        if (turno != null) {
            estado = EstadoTurno.CANCELADO;
        } else {
            throw new IllegalArgumentException("El turno con número " + numeroTurno + " no fue encontrado.");
        }
    }


    public void llamar(Asesor asesor){
        estado = EstadoTurno.LLAMADO;
        turno.setFechaLlamado(LocalDateTime.now());
    }

    public void marcarNoAtendido(Asesor asesor){
        estado = EstadoTurno.NO_ATENDIDO;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }
}

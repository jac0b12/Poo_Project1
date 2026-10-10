package com.example.demo.usuarios.service;
import com.example.demo.usuarios.model.turnos.EstadoTurno;
import com.example.demo.usuarios.model.turnos.Prioridad;
import com.example.demo.usuarios.model.turnos.Turno;
import com.example.demo.usuarios.model.solicitudes.Solicitud;
import com.example.demo.usuarios.model.usuarios.Asesor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TurnoService {
    private List<Turno> listaTurnos = new ArrayList<>();

    public Turno generarTurno(Solicitud solicitud, Prioridad prioridad) {
        if (solicitud == null) {
            throw new IllegalArgumentException("La solicitud no puede ser nula para generar un turno.");
        }

        String numeroTurno = "T-" + (listaTurnos.size() + 1);
        Turno nuevoTurno = new Turno(numeroTurno, prioridad, EstadoTurno.EN_ESPERA, LocalDateTime.now(), null);

        listaTurnos.add(nuevoTurno);
        return nuevoTurno;
    }

    public void llamarTurno(String numeroTurno, Asesor asesor) {
        Turno turno = buscarTurnoPorNumero(numeroTurno);
        if (turno != null && turno.getEstado() == EstadoTurno.EN_ESPERA) {
            turno.llamar(asesor);
        } else {
            throw new IllegalStateException("El turno no existe o no está en estado pendiente.");
        }
    }

    public void cancelarTurno(String numeroTurno) {
        Turno turno = buscarTurnoPorNumero(numeroTurno);
        if (turno != null) {
            turno.cancelar();
        }
    }

    private Turno buscarTurnoPorNumero(String numero) {
        return listaTurnos.stream()
                .filter(t -> t.getNumero().equals(numero))
                .findFirst()
                .orElse(null);
    }
}

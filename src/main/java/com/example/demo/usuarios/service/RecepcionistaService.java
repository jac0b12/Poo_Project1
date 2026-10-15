package com.example.demo.usuarios.service;

import com.example.demo.usuarios.exception.TurnoYaAtendidoException;
import com.example.demo.usuarios.model.solicitudes.Solicitud;
import com.example.demo.usuarios.model.turnos.Prioridad;
import com.example.demo.usuarios.model.turnos.Turno;

public class RecepcionistaService {
    private TurnoService turnoService;
    Turno generarTurno(Solicitud solicitud, Prioridad prioridad, TurnoService turnoService) throws TurnoYaAtendidoException {
        return this.turnoService.generarTurno(solicitud, prioridad);
    }

    public void cancelarTurno(String numeroTurno) {
        this.turnoService.cancelarTurno(numeroTurno);
    }
}

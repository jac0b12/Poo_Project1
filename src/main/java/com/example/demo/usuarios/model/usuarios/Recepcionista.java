package com.example.demo.usuarios.model.usuarios;

import com.example.demo.usuarios.model.solicitudes.Solicitud;
import com.example.demo.usuarios.model.turnos.Prioridad;
import com.example.demo.usuarios.model.turnos.Turno;
import com.example.demo.usuarios.service.TurnoService;

public class Recepcionista extends Empleado{
    private TurnoService turnoService;

    public Recepcionista(String nombre, int documento, int edad, String usuario, String clave, TurnoService turnoService) {
        super(nombre, documento, edad, usuario, clave);
        this.turnoService = turnoService;
    }


    Turno generarTurno(Solicitud solicitud, Prioridad prioridad) {
        return this.turnoService.generarTurno(solicitud, prioridad);
    }

    public void cancelarTurno(String numeroTurno) {
        this.turnoService.cancelarTurno(numeroTurno);
    }

}

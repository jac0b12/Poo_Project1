package com.example.demo.usuarios.model.usuarios;

import com.example.demo.usuarios.model.solicitudes.Solicitud;
import com.example.demo.usuarios.model.turnos.Prioridad;
import com.example.demo.usuarios.model.turnos.Turno;
import com.example.demo.usuarios.service.TurnoService;

public class Recepcionista extends Empleado{


    public Recepcionista(String nombre, int documento, int edad, String usuario, String clave) {
        super(nombre, documento, edad, usuario, clave);
    }


}

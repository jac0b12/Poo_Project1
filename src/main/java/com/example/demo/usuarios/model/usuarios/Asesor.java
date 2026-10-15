package com.example.demo.usuarios.model.usuarios;

import com.example.demo.usuarios.model.atencion.Ventanilla;
import com.example.demo.usuarios.model.turnos.Turno;
import com.example.demo.usuarios.service.TurnoService;

public class Asesor extends Empleado{
    private Coordinador coordinador;
    private Ventanilla ventanilla;
    private boolean disponible;
    private TurnoService turnoService;

    public Asesor(String nombre, int documento, int edad, String usuario, String clave,Coordinador coordinador,Ventanilla ventanilla){
        super(nombre, documento, edad, usuario, clave);
        this.coordinador = coordinador;
        this.disponible = false;
        this.ventanilla = ventanilla;
    }

    public Ventanilla getVentanilla() {
        return ventanilla;
    }

    public void setVentanilla(Ventanilla ventanilla) {
        this.ventanilla = ventanilla;
    }
}

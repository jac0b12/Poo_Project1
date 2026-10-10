package com.example.demo.usuarios.model.usuarios;

import com.example.demo.usuarios.model.atencion.Ventanilla;
import com.example.demo.usuarios.model.turnos.Turno;

public class Asesor extends Empleado{
    private Coordinador coordinador;
    private Ventanilla ventanilla;
    private boolean disponible;
    private Turno turno;

    public Asesor(String nombre, int documento, int edad, String usuario, String clave,Coordinador coordinador,Ventanilla ventanilla){
        super(nombre, documento, edad, usuario, clave);
        this.coordinador = coordinador;
        this.disponible = false;
        this.ventanilla = ventanilla;
    }

    public Turno llamarSiguiente() {
        if (this.turno != null) {
            this.turno.llamar(this); // Llama al método de la clase Turno pasándose a sí mismo (this)
        }
        return this.turno; // Retorna el objeto turno actualizado
    }
}

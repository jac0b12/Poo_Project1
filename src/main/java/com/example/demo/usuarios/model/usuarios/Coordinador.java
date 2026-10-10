package com.example.demo.usuarios.model.usuarios;

import com.example.demo.usuarios.model.atencion.Ventanilla;
import com.example.demo.usuarios.model.atencion.Reporte;

public class Coordinador extends Empleado{


    public Coordinador(String nombre, int documento, int edad, String usuario, String clave) {
        super(nombre, documento, edad, usuario, clave);
    }

    public void asignarVentanilla(Asesor asesor, Ventanilla ventanilla){

    }

    public Reporte consultarReporte(){
        return Reporte.getReporte();
    }
}

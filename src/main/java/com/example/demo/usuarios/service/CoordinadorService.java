package com.example.demo.usuarios.service;

import com.example.demo.usuarios.model.atencion.Reporte;
import com.example.demo.usuarios.model.atencion.Ventanilla;
import com.example.demo.usuarios.model.usuarios.Asesor;
import com.example.demo.usuarios.model.usuarios.Coordinador;
import org.springframework.stereotype.Service;

@Service
public class CoordinadorService {
    private Coordinador coordinador;
    private Reporte reporte;

    public void asignarVentanilla(Asesor asesor, Ventanilla ventanilla){
        asesor.setVentanilla(ventanilla);
    }

    public Reporte consultarReporte(){
        return this.reporte.getReporte();
    }
}

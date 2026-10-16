package dot.turnos.demo.usuarios.service;

import dot.turnos.demo.usuarios.model.atencion.Reporte;
import dot.turnos.demo.usuarios.model.atencion.Ventanilla;
import dot.turnos.demo.usuarios.model.usuarios.Asesor;
import dot.turnos.demo.usuarios.model.usuarios.Coordinador;
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

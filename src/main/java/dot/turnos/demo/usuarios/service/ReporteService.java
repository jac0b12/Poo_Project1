package dot.turnos.demo.usuarios.service;

import dot.turnos.demo.usuarios.model.atencion.Reporte;
import dot.turnos.demo.usuarios.model.turnos.EstadoTurno;
import dot.turnos.demo.usuarios.model.turnos.Turno;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReporteService {
    private final TurnoService turnoService;
    private  Turno turno;
    private int contador;
    private Reporte reporte;

    public ReporteService(TurnoService turnoService) {
        this.turnoService = turnoService;
    }

    public Reporte generarReporte() {


        if(turno.getEstado() == EstadoTurno.FINALIZADO){
            contador = contador + 1;
        }


        List<String> frecuentes = List.of("Renovación de Cédula", "Certificado de Residencia");
        String duracion = "30mins"; // O la lógica real que calcule la duración

        return new Reporte(contador, frecuentes, duracion);
    }


}

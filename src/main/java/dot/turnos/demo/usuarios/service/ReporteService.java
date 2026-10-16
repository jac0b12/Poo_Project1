package dot.turnos.demo.usuarios.service;

import dot.turnos.demo.usuarios.model.atencion.Reporte;
import dot.turnos.demo.usuarios.model.turnos.EstadoTurno;
import dot.turnos.demo.usuarios.model.turnos.Turno;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReporteService {
    private final TurnoService turnoService;

    public ReporteService(TurnoService turnoService) {
        this.turnoService = turnoService;
    }

    public Reporte generarReporte() {
        // Obtenemos los turnos desde el servicio de turnos
        List<Turno> turnos = turnoService.getListaTurnos();

        // Calculamos los turnos atendidos
        int turnosAtendidos = (int) turnos.stream()
                .filter(t -> t.getEstado() == EstadoTurno.FINALIZADO)
                .count();


        List<String> frecuentes = List.of("Renovación de Cédula", "Certificado de Residencia");

        return new Reporte(turnosAtendidos, frecuentes);
    }

}

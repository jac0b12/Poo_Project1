package dot.turnos.demo.usuarios.controller;

import dot.turnos.demo.usuarios.exception.TurnoYaAtendidoException;
import dot.turnos.demo.usuarios.model.atencion.Reporte;
import dot.turnos.demo.usuarios.model.solicitudes.Solicitud;
import dot.turnos.demo.usuarios.model.turnos.Prioridad;
import dot.turnos.demo.usuarios.model.turnos.Turno;
import dot.turnos.demo.usuarios.service.ReporteService;
import dot.turnos.demo.usuarios.service.TurnoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TurnoController {

    private final TurnoService turnoService;
    private final ReporteService reporteService;


    public TurnoController(TurnoService turnoService, ReporteService reporteService) {
        this.turnoService = turnoService;
        this.reporteService = reporteService;
    }


    @PostMapping("/turnos/generar")
    public Turno generarTurno(@RequestBody Solicitud solicitud, @RequestParam Prioridad prioridad) throws TurnoYaAtendidoException {
        return turnoService.generarTurno(solicitud, prioridad);
    }


    @GetMapping("/coordinador/reporte")
    public Reporte consultarReporte() {
        return reporteService.generarReporte();
    }
}
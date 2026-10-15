package com.example.demo.usuarios.controller;

import com.example.demo.usuarios.exception.TurnoYaAtendidoException;
import com.example.demo.usuarios.model.solicitudes.Solicitud;
import com.example.demo.usuarios.model.turnos.Prioridad;
import com.example.demo.usuarios.model.turnos.Turno;
import com.example.demo.usuarios.model.atencion.Reporte;
import com.example.demo.usuarios.service.TurnoService;
import com.example.demo.usuarios.service.ReporteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TurnoController {

    private final TurnoService turnoService;
    private final ReporteService reporteService;

    // Inyección de dependencias a través del constructor
    public TurnoController(TurnoService turnoService, ReporteService reporteService) {
        this.turnoService = turnoService;
        this.reporteService = reporteService;
    }

    // ==========================================
    // ENDPOINT 1: Generar un Turno (POST)
    // Recibe una Solicitud en el Body y la Prioridad como parámetro
    // ==========================================
    @PostMapping("/turnos/generar")
    public Turno generarTurno(@RequestBody Solicitud solicitud, @RequestParam Prioridad prioridad) throws TurnoYaAtendidoException {
        return turnoService.generarTurno(solicitud, prioridad);
    }

    // ==========================================
    // ENDPOINT 2: Consultar Reporte del Coordinador (GET)
    // Devuelve el reporte general del sistema de turnos y atención
    // ==========================================
    @GetMapping("/coordinador/reporte")
    public Reporte consultarReporte() {
        return reporteService.generarReporte();
    }
}
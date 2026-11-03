package dot.turnos.demo.service;

import dot.turnos.demo.usuarios.controller.TurnoController;
import dot.turnos.demo.usuarios.exception.TurnoYaAtendidoException;
import dot.turnos.demo.usuarios.model.atencion.Reporte;
import dot.turnos.demo.usuarios.model.solicitudes.Solicitud;
import dot.turnos.demo.usuarios.model.solicitudes.TipoTramite;
import dot.turnos.demo.usuarios.model.turnos.Prioridad;
import dot.turnos.demo.usuarios.model.turnos.Turno;
import dot.turnos.demo.usuarios.service.ReporteService;
import dot.turnos.demo.usuarios.service.TurnoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UsuarioServiceController {

    @Mock
    private TurnoService turnoService;

    @Mock
    private ReporteService reporteService;

    @InjectMocks
    private TurnoController turnoController; // Inyecta los dos mocks automáticamente en el controlador

    @Test
    void Prueba_returnarturno() throws TurnoYaAtendidoException {
        TipoTramite tipoTramite = org.mockito.Mockito.mock(TipoTramite.class);
        Solicitud solicitud = new Solicitud(tipoTramite, "Motivo de prueba", LocalDateTime.now()); // Si tu constructor pide parámetros, agrégalos aquí
        Prioridad prioridad = Prioridad.Normal;  // Cambia ALTA por un valor real de tu enum Prioridad
        Turno turnoEsperado = new Turno();

        when(turnoService.generarTurno(solicitud, prioridad)).thenReturn(turnoEsperado);

        // 2. Act (Llamar al método del controlador que queremos cubrir)
        Turno resultado = turnoController.generarTurno(solicitud, prioridad);

        // 3. Assert (Verificar que no sea nulo y sea el mismo objeto para matar la mutación)
        assertNotNull(resultado);
        assertEquals(turnoEsperado, resultado);
        verify(turnoService).generarTurno(solicitud, prioridad);
    }

    @Test
    void Prueba_consultarReporte() {
        // 1. Arrange
        Reporte reporteEsperado = new Reporte(); // Si tu constructor pide parámetros, agrégalos aquí
        when(reporteService.generarReporte()).thenReturn(reporteEsperado);

        // 2. Act
        Reporte resultado = turnoController.consultarReporte();

        // 3. Assert (Mata la mutación de la línea 34)
        assertNotNull(resultado);
        assertEquals(reporteEsperado, resultado);
        verify(reporteService).generarReporte();
    }
}
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
        Prioridad prioridad = Prioridad.Normal;
        Turno turnoEsperado = new Turno();

        when(turnoService.generarTurno(solicitud, prioridad)).thenReturn(turnoEsperado);

        Turno resultado = turnoController.generarTurno(solicitud, prioridad);


        assertNotNull(resultado);
        assertEquals(turnoEsperado, resultado);
        verify(turnoService).generarTurno(solicitud, prioridad);
    }

    //jacobo1
    @Test
    void Prueba_consultarReporte() {

        Reporte reporteEsperado = new Reporte(); // Si tu constructor pide parámetros, agrégalos aquí
        when(reporteService.generarReporte()).thenReturn(reporteEsperado);


        Reporte resultado = turnoController.consultarReporte();


        assertNotNull(resultado);
        assertEquals(reporteEsperado, resultado);
        verify(reporteService).generarReporte();
    }
}
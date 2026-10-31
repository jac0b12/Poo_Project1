package dot.turnos.demo.service;

import dot.turnos.demo.usuarios.model.turnos.EstadoTurno;
import dot.turnos.demo.usuarios.service.ReporteService;
import dot.turnos.demo.usuarios.service.TurnoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UsuarioServiceController {
    @Mock
    private TurnoService turnoService;
    private ReporteService reporteService;


    @BeforeEach
    void setUp(){
        EstadoTurno estadoTurno = EstadoTurno.LLAMADO;
        turnoService = new TurnoService();
        reporteService = new ReporteService(turnoService);

    }

    @Test
    void Prueba_returnarturno(){
        when(turnoService.generarTurno()

    }

}

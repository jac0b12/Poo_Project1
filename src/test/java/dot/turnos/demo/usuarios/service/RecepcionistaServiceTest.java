package dot.turnos.demo.usuarios.service;

import dot.turnos.demo.usuarios.model.turnos.Turno;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class RecepcionistaServiceTest {

    @Mock
    private TurnoService turnoService;

    @InjectMocks
    private RecepcionistaService recepcionistaService;

    @Test
    void pruebaServiceCompleto() throws Exception {
        Turno turno = new Turno();
        Mockito.when(turnoService.generarTurno(any(), any())).thenReturn(turno);

        Turno resultado = recepcionistaService.generarTurno(null, null, turnoService);

        assertNotNull(resultado);
        Mockito.verify(turnoService).generarTurno(any(), any());

        recepcionistaService.cancelarTurno("T-123");
        Mockito.verify(turnoService).cancelarTurno("T-123");
    }
}
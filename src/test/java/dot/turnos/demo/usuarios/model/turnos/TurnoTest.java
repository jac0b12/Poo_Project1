package dot.turnos.demo.usuarios.model.turnos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;

class TurnoTest {

    @Test
    void probarConstructorVacio() {
        Turno turno = new Turno();

        assertNotNull(turno);
        assertNull(turno.getNumero());
        assertNull(turno.getPrioridad());
        assertNull(turno.getEstado());
    }

    @Test
    void probarConstructorConParametros() {
        LocalDateTime fecha = LocalDateTime.of(2026, 11, 3, 10, 30);

        Turno turno = new Turno(
                "A001",
                Prioridad.Normal,
                EstadoTurno.EN_ESPERA,
                fecha,
                fecha
        );

        assertEquals("A001", turno.getNumero());
        assertEquals(Prioridad.Normal, turno.getPrioridad());
        assertEquals(EstadoTurno.EN_ESPERA, turno.getEstado());
        assertEquals(fecha, turno.getFechaLlamado());
        assertEquals(fecha, turno.getFechaGeneracion());
    }

    @Test
    void probarCambiarNumeroYPrioridad() {
        Turno turno = new Turno();

        turno.setNumero("B002");
        turno.setPrioridad(Prioridad.Prioritario);

        assertEquals("B002", turno.getNumero());
        assertEquals(Prioridad.Prioritario, turno.getPrioridad());
    }

    @Test
    void probarCambiarEstadoYFechas() {
        Turno turno = new Turno();
        LocalDateTime fecha = LocalDateTime.of(2026, 11, 3, 11, 0);

        turno.setEstado(EstadoTurno.LLAMADO);
        turno.setFechaLlamado(fecha);
        turno.setFechaGeneracion(fecha);

        assertEquals(EstadoTurno.LLAMADO, turno.getEstado());
        assertEquals(fecha, turno.getFechaLlamado());
        assertEquals(fecha, turno.getFechaGeneracion());
    }
}

package dot.turnos.demo.usuarios.model.solicitudes;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class SolicitudTest {


    @Test
    public void testConstructorVacio() {
        Solicitud solicitud = new Solicitud();
        assertNotNull(solicitud);
    }


    @Test
    public void testSetId() {
        Solicitud solicitud = new Solicitud();
        solicitud.setId(1L);
        assertNotNull(solicitud);
    }


    @Test
    public void testGetYSetMotivo() {
        Solicitud solicitud = new Solicitud();
        solicitud.setMotivo("Consulta general");
        assertEquals("Consulta general", solicitud.getMotivo());
    }


    @Test
    public void testGetYSetFechaRegistro() {
        Solicitud solicitud = new Solicitud();
        LocalDateTime ahora = LocalDateTime.now();
        solicitud.setFechaRegistro(ahora);
        assertEquals(ahora, solicitud.getFechaRegistro());
    }
}
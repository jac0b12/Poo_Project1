package dot.turnos.demo.usuarios.model.usuarios;

import dot.turnos.demo.usuarios.model.solicitudes.Solicitud;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CiudadanoTest {

    @Test
    void testCiudadanoConstructorYMetodos() {

        Ciudadano ciudadano = new Ciudadano("Juan", 10203040, 30, "3001234567");


        assertNotNull(ciudadano.getSolicitudes());
        assertEquals(0, ciudadano.getSolicitudes().size());


        List<Solicitud> listaLlena = new ArrayList<>();
        Solicitud solicitudMock = Mockito.mock(Solicitud.class);
        listaLlena.add(solicitudMock);

        ciudadano.setSolicitudes(listaLlena);


        assertEquals(1, ciudadano.getSolicitudes().size());
        assertEquals(listaLlena, ciudadano.getSolicitudes());
    }
}
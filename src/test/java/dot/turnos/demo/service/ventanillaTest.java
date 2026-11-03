package dot.turnos.demo.service;

import dot.turnos.demo.usuarios.model.atencion.Pausa;
import dot.turnos.demo.usuarios.model.atencion.Ventanilla;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

//jacobo4

@ExtendWith(MockitoExtension.class)
public class ventanillaTest {
    @Test
    void pruebaPausa(){
        Long id = 1L;
        String nombre = "juan";
        boolean ocupada = false;


        Ventanilla ventanilla = new Ventanilla(id, nombre);


        assertNotNull(ventanilla);
        assertEquals(id, ventanilla.getId());
        assertEquals(nombre, ventanilla.getNombre());
        assertEquals(ocupada, ventanilla.isOcupada());

        Ventanilla ventanilla1 = new Ventanilla();

        ventanilla1.setId(2L);
        ventanilla1.setNombre("Ventura");
        ventanilla1.setOcupada(true);

        assertEquals(2L, ventanilla1.getId());
        assertEquals("Ventura", ventanilla1.getNombre());
        assertTrue(ventanilla1.isOcupada());

    }

}

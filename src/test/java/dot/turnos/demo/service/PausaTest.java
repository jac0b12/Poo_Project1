package dot.turnos.demo.service;

import dot.turnos.demo.usuarios.model.atencion.Pausa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class PausaTest {

    //jacobo3
    @Test
    void pruebaPausa(){
        LocalDateTime inicio = LocalDateTime.now();
        LocalDateTime fin = inicio.plusHours(1);
        String motivo = "Nose we";


        Pausa pausa = new Pausa(inicio, fin, motivo);


        assertNotNull(pausa);
        assertEquals(inicio, pausa.getInicio());
        assertEquals(fin, pausa.getFin());
        assertEquals(motivo, pausa.getMotivoPausa());
    }
}

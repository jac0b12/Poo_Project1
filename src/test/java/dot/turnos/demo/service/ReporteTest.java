package dot.turnos.demo.service;

import dot.turnos.demo.usuarios.model.atencion.Pausa;
import dot.turnos.demo.usuarios.model.atencion.Reporte;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)

public class ReporteTest {

    @Mock
    private Reporte reporte;

    //jacobo2
    @Test
    void pruebaReporte(){
        int cantTurnos = reporte.getCantTurnos();
        List<String> listaTamites = List.of("Nose", "Nose2", "Nose3");
        String duracion = "mucho alvrg";


        Reporte reporte = new Reporte(cantTurnos, listaTamites, duracion);



        reporte.sumaCantidadTurnos();

        assertNotNull(reporte);
        assertEquals(cantTurnos + 1, reporte.getCantTurnos());

        Reporte reporteGenerado = reporte.getReporte();
        assertNotNull(reporteGenerado);
        assertEquals(reporte.getCantTurnos(), reporteGenerado.getCantTurnos());

        assertEquals(listaTamites, reporte.tramitesFrecuentes());
        assertEquals(duracion, reporte.getDuracion());
    }
}

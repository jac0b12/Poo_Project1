package dot.turnos.demo.usuarios.model.atencion;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "reporte")
public class Reporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int cantTurnos;
    private List<String> listaTramites = new ArrayList<>();

    public Reporte(){

    }

    public Reporte( int cantTurnos, List<String> listaTramites) {

        this.cantTurnos = cantTurnos;
        this.listaTramites = listaTramites;
    }
    /*
    public Duration tiempoPromedioEspera(){

    }



    list tramitesFrecuentes(){

    }

    */

    public void sumaCantidadTurnos(){
        cantTurnos = cantTurnos + 1;
    }

    public Reporte getReporte() {
        return new Reporte(cantTurnos, listaTramites);
    }

    public List<String> tramitesFrecuentes() {
        return listaTramites;
    }


}

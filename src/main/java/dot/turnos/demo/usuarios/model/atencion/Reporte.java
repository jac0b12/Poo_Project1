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
    private String duracion;

    public Reporte(){

    }

    public Reporte( int cantTurnos, List<String> listaTramites,String duracion ) {
        this.cantTurnos = cantTurnos;
        this.listaTramites = listaTramites;
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void sumaCantidadTurnos(){
        cantTurnos = cantTurnos + 1;
    }

    public Reporte getReporte() {
        return new Reporte(cantTurnos, listaTramites, duracion);
    }

    public List<String> tramitesFrecuentes() {
        return listaTramites;
    }


}

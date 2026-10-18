package dot.turnos.demo.usuarios.model.solicitudes;

import jakarta.persistence.*;

@Entity
@Table(name = "tipos_tramite")
public class TipoTramite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private int tiempoEstimadoMin;

    public TipoTramite(){

    }

    public TipoTramite(int id ,String nombre,int tiempoEstimadoMin){
        this.id = id;
        this.nombre = nombre;
        this.tiempoEstimadoMin = tiempoEstimadoMin;

    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoEstimadoMin() {
        return tiempoEstimadoMin;
    }
    public void setTiempoEstimadoMin(int tiempoEstimadoMin) {
        this.tiempoEstimadoMin = tiempoEstimadoMin;
    }
}

package dot.turnos.demo.usuarios.model.turnos;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "turno")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String numero;

    private Prioridad prioridad;
    private EstadoTurno estado;
    private LocalDateTime fechaLlamado;
    private LocalDateTime fechaGeneracion;


    public Turno(){

    }

    public Turno(String numero, Prioridad prioridad, EstadoTurno estado, LocalDateTime fechaLlamado, LocalDateTime fechaGeneracion){
        this.numero = numero;
        this.prioridad = prioridad;
        this.estado = estado;
        this.fechaLlamado = fechaLlamado;
        this.fechaGeneracion = fechaGeneracion;
    }




    //getts
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public Prioridad getPrioridad() { return prioridad; }
    public void setPrioridad(Prioridad prioridad) { this.prioridad = prioridad; }

    public EstadoTurno getEstado() { return estado; }
    public void setEstado(EstadoTurno estado) { this.estado = estado; }

    public LocalDateTime getFechaGeneracion() { return fechaGeneracion; }
    public void setFechaGeneracion(LocalDateTime fechaGeneracion) { this.fechaGeneracion = fechaGeneracion; }

    public LocalDateTime getFechaLlamado() { return fechaLlamado; }
    public void setFechaLlamado(LocalDateTime fechaLlamado) { this.fechaLlamado = fechaLlamado; }

}

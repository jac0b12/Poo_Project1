package dot.turnos.demo.usuarios.model.atencion;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "atencion")
public class Atencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;
    private String observaciones;
    private ResultadoAtencion resultado;

    public Atencion(){

    }


    public Atencion(int id, LocalDateTime horaInicio, LocalDateTime horaFin, String observaciones, ResultadoAtencion resultado){
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.observaciones = observaciones;
        this.resultado = resultado;
    }


}

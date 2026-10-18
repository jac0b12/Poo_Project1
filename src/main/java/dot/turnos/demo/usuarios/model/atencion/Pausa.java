package dot.turnos.demo.usuarios.model.atencion;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pausa")
public class Pausa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime inicio;
    private LocalDateTime fin;
    private String motivoPausa;

    public Pausa(){

    }

    public Pausa(LocalDateTime inicio, LocalDateTime fin, String motivoPausa){
        this.inicio = inicio;
        this.fin = fin;
        this.motivoPausa = motivoPausa;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public String getMotivoPausa() {
        return motivoPausa;
    }
}

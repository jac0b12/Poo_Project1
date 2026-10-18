package dot.turnos.demo.usuarios.model.solicitudes;

import dot.turnos.demo.usuarios.model.usuarios.Ciudadano;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "solicitud")
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime fechaRegistro;
    private String motivo;

    @ManyToOne
    @JoinColumn(name = "tipo_tramite_id")
    private TipoTramite tipoTramite;

    @ManyToOne
    @JoinColumn(name = "ciudadano_id")
    private Ciudadano ciudadano;

    public Solicitud(){

    }


    public Solicitud(TipoTramite tipoTramite , String motivo, LocalDateTime fechaRegistro) {
        this.motivo = motivo;
        this.fechaRegistro = LocalDateTime.now();
        this.tipoTramite = tipoTramite;
    }





    public void setId(long id) {
        this.id = id;
    }


    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public TipoTramite getTipoTramite() {
        return tipoTramite;
    }
    public void setTipoTramite(TipoTramite tipoTramite) {
        this.tipoTramite = tipoTramite;
    }
}

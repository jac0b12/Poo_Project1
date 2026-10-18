package dot.turnos.demo.usuarios.model.usuarios;

import dot.turnos.demo.usuarios.model.core.Persona;
import dot.turnos.demo.usuarios.model.solicitudes.Solicitud;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ciudadano")
public class Ciudadano extends Persona {




    @OneToMany(mappedBy = "ciudadano", cascade = CascadeType.ALL)
    private List<Solicitud> solicitudes;

    public Ciudadano(){
        super();
    }


    public Ciudadano(String nombre, int documento, int edad, String telefono) {
        super(nombre, documento, edad, telefono);

        this.solicitudes = new ArrayList<>();
    }

    public List<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }

}

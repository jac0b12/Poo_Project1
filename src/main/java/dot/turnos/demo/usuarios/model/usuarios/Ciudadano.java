package dot.turnos.demo.usuarios.model.usuarios;

import dot.turnos.demo.usuarios.model.core.Persona;
import dot.turnos.demo.usuarios.model.solicitudes.Solicitud;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ciudadano")
public class Ciudadano extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String telefono;
    private List<Solicitud> solicitud;

    public Ciudadano(){
        super();
    }


    public Ciudadano(String nombre, int documento, int edad, String telefono) {
        super(nombre, documento, edad, telefono);
        this.telefono = telefono;
        this.solicitud = new ArrayList<>();
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

package dot.turnos.demo.usuarios.model.usuarios;

import jakarta.persistence.*;

@Entity
@Table(name = "recepcionista")
public class Recepcionista extends Empleado{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Recepcionista(){
        super();
    }
    public Recepcionista(String nombre, int documento, int edad, String usuario, String clave, String telefono) {
        super(nombre, documento, edad, usuario, clave, telefono);
    }


}

package dot.turnos.demo.usuarios.model.usuarios;


import jakarta.persistence.*;

@Entity // 1. Marca la clase como entidad de JPA
@Table(name = "coordinadores")
public class Coordinador extends Empleado{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Coordinador() {
        super();
    }

    public Coordinador(String nombre, int documento, int edad, String usuario,String telefono, String clave) {
        super(nombre, documento, edad, usuario, clave, telefono);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}

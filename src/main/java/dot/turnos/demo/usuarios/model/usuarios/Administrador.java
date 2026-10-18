package dot.turnos.demo.usuarios.model.usuarios;

import jakarta.persistence.*;

@Entity
@Table(name = "administrador")
public class Administrador extends Empleado{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Administrador(){
        super();
    }

    public Administrador(String nombre, int documento, int edad, String usuario, String telefono ,String clave) {
        super(nombre, documento, edad, usuario, clave, telefono);
    }


    /*
    public void gestionarTiposTramite(aqui se pueden llamar los set){}

    public void gestionarUsuarios(aqui se pueden llamar los set){}

     */
}

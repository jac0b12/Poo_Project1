package dot.turnos.demo.usuarios.model.usuarios;

import jakarta.persistence.*;

@Entity
@Table(name = "administrador")
public class Administrador extends Empleado{


    public Administrador(){
        super();
    }

    public Administrador(String nombre, int documento, int edad, String usuario, String telefono ,String clave) {
        super(nombre, documento, edad, usuario, clave, telefono);
    }



}

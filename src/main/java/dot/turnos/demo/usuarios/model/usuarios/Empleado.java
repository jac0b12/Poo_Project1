package dot.turnos.demo.usuarios.model.usuarios;

import dot.turnos.demo.usuarios.model.core.Persona;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Empleado extends Persona {
    private String usuario;
    private String clave;
    private boolean activo;

    public Empleado(){
        super();
    }

    public Empleado(String nombre, int documento, int edad, String usuario, String telefono ,String clave) {
        super(nombre, documento, edad, telefono);
        this.usuario = usuario;
        this.clave = clave;
        this.activo = false;
    }
}

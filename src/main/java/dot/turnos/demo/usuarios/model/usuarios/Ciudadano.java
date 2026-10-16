package dot.turnos.demo.usuarios.model.usuarios;

import dot.turnos.demo.usuarios.model.core.Persona;
import dot.turnos.demo.usuarios.model.solicitudes.Solicitud;

import java.util.ArrayList;
import java.util.List;

public class Ciudadano extends Persona {
    private String telefono;
    private List<Solicitud> solicitud;


    public Ciudadano(String nombre, int documento, int edad, String telefono) {
        super(nombre, documento, edad);
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

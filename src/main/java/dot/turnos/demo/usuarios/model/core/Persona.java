package dot.turnos.demo.usuarios.model.core;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private int documento;
    private int edad;

    private String telefono;


    public Persona(){

    }

    public Persona(String nombre, int documento, int edad, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.telefono = telefono;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }
}

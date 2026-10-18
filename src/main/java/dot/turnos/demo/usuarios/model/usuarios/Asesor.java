package dot.turnos.demo.usuarios.model.usuarios;

import dot.turnos.demo.usuarios.model.atencion.Ventanilla;
import dot.turnos.demo.usuarios.service.TurnoService;
import jakarta.persistence.*;

@Entity
@Table(name="asesores")
public class Asesor extends Empleado{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "coordinador_id")
    private Coordinador coordinador;

    @OneToOne
    @JoinColumn(name = "ventanilla_id")
    private Ventanilla ventanilla;

    @Column(name = "esta_disponible")
    private boolean disponible;


    public Asesor() {
        super();
    }

    // Constructor con parámetros (puedes adaptarlo según tu clase Empleado)
    public Asesor(String nombre, int documento, int edad, String usuario, String telefono, String clave, Coordinador coordinador, Ventanilla ventanilla) {
        super(nombre, documento, edad, usuario, clave, telefono);
        this.coordinador = coordinador;
        this.disponible = false;
        this.ventanilla = ventanilla;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public Ventanilla getVentanilla() {
        return ventanilla;
    }

    public void setVentanilla(Ventanilla ventanilla) {
        this.ventanilla = ventanilla;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

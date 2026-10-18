package dot.turnos.demo.usuarios.model.atencion;

import jakarta.persistence.*;


@Entity
@Table(name = "ventanillas")
public class Ventanilla {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;


        private String nombre;
        private boolean ocupada;

        public Ventanilla(){

        }

        public Ventanilla(long id, String nombre){
            this.id = id;
            this.nombre = nombre;
            this.ocupada = false;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}

package dot.turnos.demo.usuarios.service;

import dot.turnos.demo.usuarios.exception.TurnoYaAtendidoException;
import dot.turnos.demo.usuarios.model.solicitudes.Solicitud;
import dot.turnos.demo.usuarios.model.turnos.EstadoTurno;
import dot.turnos.demo.usuarios.model.turnos.Prioridad;
import dot.turnos.demo.usuarios.model.turnos.Turno;
import dot.turnos.demo.usuarios.model.usuarios.Asesor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TurnoService {
    private Turno turno;
    private int numero = 0;
    private EstadoTurno estado;

    // 1. NUEVO: Creamos una lista para guardar los turnos y que React los pueda ver
    private List<Turno> turnosGuardados = new ArrayList<>();

    public Turno generarTurno(Solicitud solicitud, Prioridad prioridad) throws TurnoYaAtendidoException {
        if (solicitud == null) {
            throw new IllegalArgumentException("La solicitud no puede ser nula para generar un turno.");
        } else if(estado == EstadoTurno.EN_ATENCION){
            throw new TurnoYaAtendidoException("El turno ya esta siendo atendido");
        }

        numero++; // Aumento el contador para que los turnos sean T-1, T-2, T-3...
        String numeroTurno = "T-" + numero;
        Turno nuevoTurno = new Turno(numeroTurno, prioridad, EstadoTurno.EN_ESPERA, LocalDateTime.now(), null);

        // 2. NUEVO: Guardamos el turno recién creado en nuestra lista
        turnosGuardados.add(nuevoTurno);

        return nuevoTurno;
    }

    // 3. NUEVO: El método que tu TurnoController estaba buscando (esto quita el error rojo)
    public List<Turno> obtenerTodos() {
        return turnosGuardados;
    }

    public void cancelarTurno(String numeroTurno) {
        if (turno != null) {
            estado = EstadoTurno.CANCELADO;
        } else {
            throw new IllegalArgumentException("El turno con número " + numeroTurno + " no fue encontrado.");
        }
    }

    public void llamar(Asesor asesor){
        estado = EstadoTurno.LLAMADO;
        turno.setFechaLlamado(LocalDateTime.now());
    }

    public void marcarNoAtendido(Asesor asesor){
        estado = EstadoTurno.NO_ATENDIDO;
    }
}

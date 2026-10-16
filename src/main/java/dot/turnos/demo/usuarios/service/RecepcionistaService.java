package dot.turnos.demo.usuarios.service;

import dot.turnos.demo.usuarios.exception.TurnoYaAtendidoException;
import dot.turnos.demo.usuarios.model.solicitudes.Solicitud;
import dot.turnos.demo.usuarios.model.turnos.Prioridad;
import dot.turnos.demo.usuarios.model.turnos.Turno;

public class RecepcionistaService {
    private TurnoService turnoService;
    Turno generarTurno(Solicitud solicitud, Prioridad prioridad, TurnoService turnoService) throws TurnoYaAtendidoException {
        return this.turnoService.generarTurno(solicitud, prioridad);
    }

    public void cancelarTurno(String numeroTurno) {
        this.turnoService.cancelarTurno(numeroTurno);
    }
}

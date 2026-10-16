package dot.turnos.demo.usuarios.service;

import dot.turnos.demo.usuarios.model.solicitudes.Solicitud;
import dot.turnos.demo.usuarios.model.usuarios.Ciudadano;

public class SolicitudService {
    private Ciudadano ciudadano;
    private Solicitud solicitud;
    private int numSolicitud;
    private static int contador = 0;


    public SolicitudService(Solicitud solicitud, Ciudadano ciudadano) {
        this.solicitud = solicitud;
        this.ciudadano = ciudadano;
    }

    public void registrar() {

        contador++;
        numSolicitud = contador;

        System.out.println("Solicitud: " + numSolicitud
                + " registrada para: " + ciudadano.getNombre());
    }

}

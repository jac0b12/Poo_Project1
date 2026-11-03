package dot.turnos.demo.usuarios.service;

import dot.turnos.demo.usuarios.model.solicitudes.TipoTramite;
import dot.turnos.demo.usuarios.model.usuarios.Administrador;
import dot.turnos.demo.usuarios.repository.TipoTramiteRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class administradorService {

    private final TipoTramiteRepository tipoTramiteRepository;

    // Inyectamos el repositorio para interactuar con la base de datos
    public administradorService(TipoTramiteRepository tipoTramiteRepository) {
        this.tipoTramiteRepository = tipoTramiteRepository;
    }

    @Transactional
    public TipoTramite cambiarTipoTramite(Long id, String nuevoNombre, int nuevoTiempo) {
        TipoTramite tipoTramite = tipoTramiteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tipo de trámite no encontrado"));

        tipoTramite.setNombre(nuevoNombre);
        tipoTramite.setTiempoEstimadoMin(nuevoTiempo);

        return tipoTramiteRepository.save(tipoTramite);
    }
}

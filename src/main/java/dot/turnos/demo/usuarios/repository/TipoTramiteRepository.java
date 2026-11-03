package dot.turnos.demo.usuarios.repository;

import dot.turnos.demo.usuarios.model.solicitudes.TipoTramite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoTramiteRepository extends JpaRepository<TipoTramite, Long> {


}

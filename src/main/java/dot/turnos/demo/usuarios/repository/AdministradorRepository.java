package dot.turnos.demo.usuarios.repository;

import dot.turnos.demo.usuarios.model.usuarios.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long> {

}

package dot.turnos.demo.usuarios.service;


import dot.turnos.demo.usuarios.model.core.Persona;
import dot.turnos.demo.usuarios.model.usuarios.Ciudadano;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadanoService {
    public List<Ciudadano> listar() {
        return List.of(
                new Ciudadano("juanito", 102345123, 18, "10234513"),
                new Ciudadano("carlos", 102345321, 23, "102342343")
                );
    }
}


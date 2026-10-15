package com.example.demo.usuarios.service;

import com.example.demo.usuarios.model.usuarios.Asesor;
import org.springframework.stereotype.Service;

@Service
public class AsesorService {
    private Asesor asesor;
    private TurnoService turnoService;

    public TurnoService llamarSiguiente() {
        if (this.turnoService != null) {
            this.turnoService.llamar(asesor);
        }
        return this.turnoService; // Retorna el objeto turno actualizado
    }
}

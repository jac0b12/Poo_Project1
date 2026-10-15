package com.example.demo.usuarios.model.atencion;

import java.time.LocalDateTime;

public class Pausa {
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private String motivoPausa;

    public Pausa(LocalDateTime inicio, LocalDateTime fin, String motivoPausa){
        this.inicio = inicio;
        this.fin = fin;
        this.motivoPausa = motivoPausa;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public String getMotivoPausa() {
        return motivoPausa;
    }
}

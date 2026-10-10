package com.example.demo.usuarios.model.atencion;

public class Ventanilla {
        private int id;
        private String nombre;
        private boolean ocupada;

        public Ventanilla(int id, String nombre){
            this.id = id;
            this.nombre = nombre;
            this.ocupada = false;
        }
}

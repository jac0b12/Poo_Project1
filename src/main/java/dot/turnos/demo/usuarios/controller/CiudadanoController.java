package dot.turnos.demo.usuarios.controller;

import dot.turnos.demo.usuarios.model.usuarios.Ciudadano;
import dot.turnos.demo.usuarios.service.CiudadanoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciudadano")
@CrossOrigin(origins = "http://localhost:5173")
public class CiudadanoController{
    private final CiudadanoService ciudadanoService;

    public CiudadanoController(CiudadanoService ciudadanoService){
        this.ciudadanoService = ciudadanoService;
    }

    @GetMapping
    public List<Ciudadano> listar(){
        return ciudadanoService.listar();
    }
}

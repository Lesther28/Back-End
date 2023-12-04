package hn.lenguajes.proyecto.restaurante.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes.proyecto.restaurante.servicios.ComidaIngreService;

@RestController
@RequestMapping("/api/comidaingre")
public class ComidaIngreController {
    
    @Autowired
    private ComidaIngreService comidaIngreService;
    
    @PostMapping("/asociar")
    public void asociarComidaConIngrediente(@RequestParam int idComida, @RequestParam int idIngrediente) {
        comidaIngreService.asociarComidaConIngrediente(idComida, idIngrediente);
    }
     
}

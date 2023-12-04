package hn.lenguajes.proyecto.restaurante.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes.proyecto.restaurante.servicios.OrdenComidaService;
import hn.lenguajes.proyecto.restaurante.servicios.impl.OrdenComidaServiceImpl;

@RestController
@RequestMapping("/api/orden_comida")
public class OrdenComidaController {

    @Autowired
    private OrdenComidaServiceImpl ordenComidaServiceImpl;


    @PostMapping("/asociar")
    public String  asociarComidaConOrden(@RequestParam int id_comida, @RequestParam int id_orden) {
       return  this.ordenComidaServiceImpl.asociarComidaConOrden(id_comida, id_orden);
    }
    }


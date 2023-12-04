package hn.lenguajes.proyecto.restaurante.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes.proyecto.restaurante.modelos.TipoComida;
import hn.lenguajes.proyecto.restaurante.servicios.impl.TipoComidaServiceImpl;

@RestController
@RequestMapping("/api/tipocomida")
public class TipoComidaController {
    
    @Autowired    
    public TipoComidaServiceImpl TPSI;

    
    @PostMapping("/crear")
    public TipoComida CrearTP(@RequestBody TipoComida nvoTipoComida){
    return this.TPSI.CrearTP(nvoTipoComida);
    }

    @GetMapping("/todos")
    public List<TipoComida> ObtenerTodos(){
    return this.TPSI.obtenerTodos();
    }

    @DeleteMapping("/Eliminar")
    public String ElimiarTP(@RequestParam (name = "id_tipo_comida") int id_tipo_comida){
    return this.TPSI.ElimiarTP(id_tipo_comida);
    }
     
}

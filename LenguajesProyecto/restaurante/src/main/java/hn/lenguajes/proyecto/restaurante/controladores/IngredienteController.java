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

import hn.lenguajes.proyecto.restaurante.modelos.Ingrediente;
import hn.lenguajes.proyecto.restaurante.servicios.impl.IngredienteServiceImpl;

@RestController
@RequestMapping("api/ingrediente")
public class IngredienteController {
    
    @Autowired    
public IngredienteServiceImpl ingredienteServiceImpl;


@PostMapping("/crear")
public Ingrediente crearIngrediente (@RequestBody Ingrediente nvoIngrediente){
    return this.ingredienteServiceImpl.crearIngrediente(nvoIngrediente);
}

@GetMapping("/todos")
public List<Ingrediente> ObtenerTodos(){
    return this.ingredienteServiceImpl.obtenerTodos();
}

@DeleteMapping("/Eliminar")
public String eliminarIngrediente(@RequestParam (name = "id_ingrediente") int id_ingrediente){
    return this.ingredienteServiceImpl.eliminarIngrediente(id_ingrediente);
}

}

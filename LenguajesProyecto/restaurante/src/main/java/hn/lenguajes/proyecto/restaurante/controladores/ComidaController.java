package hn.lenguajes.proyecto.restaurante.controladores;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import hn.lenguajes.proyecto.restaurante.modelos.Cliente;
import hn.lenguajes.proyecto.restaurante.modelos.Comida;
import hn.lenguajes.proyecto.restaurante.servicios.impl.ComidaServiceImpl;

@RestController
@RequestMapping("/api/comida")
public class ComidaController {
    
@Autowired    
public ComidaServiceImpl comidaServiceImpl;

@PostMapping("/crear")
public Comida crearComida(@RequestBody Comida nvaComida){
    return this.comidaServiceImpl.CrearComida(nvaComida);
}

@GetMapping("/todos")
public List<Comida> obtenerTodos(){
    return this.comidaServiceImpl.ObtenerTodos();
}

@DeleteMapping("/eliminar")
public String eliminarComidaPorId(@RequestParam(name="id_comida") int id_comida){
return this.comidaServiceImpl.EliminarComida(id_comida); 

}

}

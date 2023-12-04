package hn.lenguajes.proyecto.restaurante.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import hn.lenguajes.proyecto.restaurante.modelos.Cliente;
import hn.lenguajes.proyecto.restaurante.modelos.Orden;
import hn.lenguajes.proyecto.restaurante.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    
 @Autowired 
    public ClienteServiceImpl clienteServiceImpl;

    
@PostMapping("/crear")
    public Cliente crearCliente (@RequestBody Cliente nvoCliente){
    
 return this.clienteServiceImpl.CrearCliente(nvoCliente); 
}

@GetMapping("/todos")
public List<Cliente> obtenerTodos(){
    return this.clienteServiceImpl.obtenerTodos();
}


@DeleteMapping("/eliminar")
public String eliminarClientePorId(@RequestParam(name="id_cliente") int id_cliente){
return this.clienteServiceImpl.eliminarCliente(id_cliente); 

}
}
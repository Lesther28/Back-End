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
import hn.lenguajes.proyecto.restaurante.modelos.Comida;
import hn.lenguajes.proyecto.restaurante.modelos.Orden;
import hn.lenguajes.proyecto.restaurante.servicios.impl.OrdenServiceImpl;

@RestController
@RequestMapping("/api/orden")
public class OrdenController {

@Autowired
public OrdenServiceImpl ordenServiceImpl;

    @PostMapping("/crear")
public String crearOrden(@RequestParam (name="id_cliente") int id_cliente, //reques param xq le enviaremos el dni
                                        @RequestBody Orden orden ){ {// request body xq le enviaremos datos de la cuenta


if(this.ordenServiceImpl.agregarOrdenCliente(id_cliente, orden)!=null){
return "Se ha agregado la cuenta al cliente: "+ id_cliente;  // caso q se agregue

}
 
return "No se ha agregado la cuenta al cliente: " +id_cliente;
                                                           }
                   } 
                 
                
                
@GetMapping("/todos")
public List<Orden> obtenerTodos(){
    return this.ordenServiceImpl.ObtenerTodos();
}


@DeleteMapping("/eliminar")
public String eliminarClientePorId(@RequestParam(name="id_orden") int id_orden){
return this.ordenServiceImpl.EliminarOrden(id_orden); 

}


}
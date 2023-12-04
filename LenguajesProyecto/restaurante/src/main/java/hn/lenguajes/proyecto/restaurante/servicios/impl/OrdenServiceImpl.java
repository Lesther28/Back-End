package hn.lenguajes.proyecto.restaurante.servicios.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.proyecto.restaurante.modelos.Cliente;
import hn.lenguajes.proyecto.restaurante.modelos.Comida;
import hn.lenguajes.proyecto.restaurante.modelos.Orden;
import hn.lenguajes.proyecto.restaurante.repositorios.ClienteRepositorio;
import hn.lenguajes.proyecto.restaurante.repositorios.OrdenRepositorio;
import hn.lenguajes.proyecto.restaurante.servicios.OrdenService;
@Service
public class OrdenServiceImpl implements OrdenService {

 @Autowired
 private ClienteRepositorio clienteRepositorio;

    @Autowired
    private OrdenRepositorio ordenRepositorio;

    @Override
    public Cliente agregarOrdenCliente(int id_cliente, Orden orden) {
        Cliente cteActualizar = this.BuscarCliente(id_cliente); 
if(cteActualizar!=null){
    orden.setCliente(cteActualizar);;
    this.ordenRepositorio.save(orden);

}

return cteActualizar; 

    }
    private Cliente BuscarCliente(int id_cliente){  
     return this.clienteRepositorio.findById(id_cliente).get(); 
}
    @Override
    public List<Orden> ObtenerTodos() {
       return this.ordenRepositorio.findAll();
    }
    @Override
    public String EliminarOrden(int id_orden) {
       Orden ordenELiminar = this.ordenRepositorio.findById(id_orden).get();
if(ordenELiminar!=null){
this.ordenRepositorio.delete(ordenELiminar); 
return "Se ha eliminado la orden";
}

      return "Error al eliminar la orden";
    }
}
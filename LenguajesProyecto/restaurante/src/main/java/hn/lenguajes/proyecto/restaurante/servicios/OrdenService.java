package hn.lenguajes.proyecto.restaurante.servicios;

import java.util.List;

import hn.lenguajes.proyecto.restaurante.modelos.Cliente;
import hn.lenguajes.proyecto.restaurante.modelos.Comida;
import hn.lenguajes.proyecto.restaurante.modelos.Orden;

public interface OrdenService {
    
   
   public List<Orden> ObtenerTodos ();

   public Cliente agregarOrdenCliente (int id_cliente, Orden orden);

   public String EliminarOrden (int id_orden);

}

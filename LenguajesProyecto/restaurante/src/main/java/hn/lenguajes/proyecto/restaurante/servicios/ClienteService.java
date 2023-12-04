package hn.lenguajes.proyecto.restaurante.servicios;

import java.util.List;
import hn.lenguajes.proyecto.restaurante.modelos.Cliente;

public interface ClienteService {
    public Cliente CrearCliente(Cliente cliente); 

     public String eliminarCliente(int id_cliente);

      public List<Cliente> obtenerTodos();
}

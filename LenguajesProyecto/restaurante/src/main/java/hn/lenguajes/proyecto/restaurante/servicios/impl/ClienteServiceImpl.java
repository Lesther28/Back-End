package hn.lenguajes.proyecto.restaurante.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.proyecto.restaurante.modelos.Cliente;
import hn.lenguajes.proyecto.restaurante.repositorios.ClienteRepositorio;
import hn.lenguajes.proyecto.restaurante.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public Cliente CrearCliente(Cliente cliente) {
        Cliente clienteCreado= this.clienteRepositorio.save(cliente);
        return clienteCreado;
    }

    @Override
    public String eliminarCliente(int id_cliente) {
        Cliente cteEliminar=this.clienteRepositorio.findById(id_cliente).get();  //Esta busqueda nos retorna un cliente o un valor null
        if(cteEliminar!=null){
    this.clienteRepositorio.delete(cteEliminar);
    return "Se ha eliminado el cliente" + cteEliminar.getId_cliente();
        }
        return "No exist el cliente con dni: " + id_cliente;
    }

    @Override
    public List<Cliente> obtenerTodos() {
        return this.clienteRepositorio.findAll(); // obtener todos los elementos de la tala clientes

    }
    
}

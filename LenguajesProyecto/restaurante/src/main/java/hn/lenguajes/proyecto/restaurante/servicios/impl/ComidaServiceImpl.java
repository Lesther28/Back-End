package hn.lenguajes.proyecto.restaurante.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import hn.lenguajes.proyecto.restaurante.modelos.Cliente;
import hn.lenguajes.proyecto.restaurante.modelos.Comida;
import hn.lenguajes.proyecto.restaurante.repositorios.ComidaRepositorio;
import hn.lenguajes.proyecto.restaurante.servicios.ComidaService;

@Service
public class ComidaServiceImpl implements ComidaService{

@Autowired
private ComidaRepositorio comidaRepositorio;

 
    @Override
    public String EliminarComida(int id_comida) {
Comida comidaELiminar = this.comidaRepositorio.findById(id_comida).get();
if(comidaELiminar!=null){
this.comidaRepositorio.delete(comidaELiminar); 
return "Se ha eliminado la comida";
}

      return "Error al eliminar la comida";
    }

    @Override
    public List<Comida> ObtenerTodos() {
      return this.comidaRepositorio.findAll();
    }

    @Override
    public Comida CrearComida(Comida nvaComida) {
           Comida comidaCreada= this.comidaRepositorio.save(nvaComida);
        return comidaCreada;
    }
    
}

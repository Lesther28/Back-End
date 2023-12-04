package hn.lenguajes.proyecto.restaurante.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.proyecto.restaurante.modelos.TipoComida;
import hn.lenguajes.proyecto.restaurante.repositorios.TipoComidaRepositorio;
import hn.lenguajes.proyecto.restaurante.servicios.TipoComidaService;

@Service
public class TipoComidaServiceImpl implements TipoComidaService {


    @Autowired
    private TipoComidaRepositorio TPRepositorio;
    @Override
    public TipoComida CrearTP(TipoComida nvoTipoComida) {
        TipoComida TPCreada = this.TPRepositorio.save(nvoTipoComida);
        return TPCreada;
    }

    @Override
    public String ElimiarTP(int idTP) {
        
        TipoComida TPEliminar = this.TPRepositorio.findById(idTP).get();
        if(TPEliminar!=null){
        this.TPRepositorio.delete(TPEliminar); 
        return "Se ha eliminado el tipo de comida";
        }

            return "Error al eliminar el tipo de comida";
        }
             
    

    @Override
    public List<TipoComida> obtenerTodos() {
        return this.TPRepositorio.findAll();
    }
    
}

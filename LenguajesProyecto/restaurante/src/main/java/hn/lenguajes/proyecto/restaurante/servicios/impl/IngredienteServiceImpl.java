package hn.lenguajes.proyecto.restaurante.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.proyecto.restaurante.modelos.Ingrediente;
import hn.lenguajes.proyecto.restaurante.repositorios.IngredienteRepositorio;
import hn.lenguajes.proyecto.restaurante.servicios.IngredienteService;

@Service
public class IngredienteServiceImpl implements IngredienteService {

    @Autowired
    private IngredienteRepositorio ingredienteRepositorio;

    @Override
    public Ingrediente crearIngrediente(Ingrediente nvoIngrediente) {
        Ingrediente ingredienteCreado = this.ingredienteRepositorio.save(nvoIngrediente);
        return ingredienteCreado;
    }

    @Override
    public String eliminarIngrediente(int idIngrediente) {
        Ingrediente ingredienteEliminar = this.ingredienteRepositorio.findById(idIngrediente).orElse(null);
        if (ingredienteEliminar != null){
            this.ingredienteRepositorio.delete(ingredienteEliminar);
            return "El ingrediente se ha eliminado";
        }

        return "Error al eliminar el ingrediente";
    }

    @Override
    public List<Ingrediente> obtenerTodos(){
        return this.ingredienteRepositorio.findAll();
    }
    
    
}



package hn.lenguajes.proyecto.restaurante.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.proyecto.restaurante.modelos.Comida;
import hn.lenguajes.proyecto.restaurante.modelos.ComidaIngre;
import hn.lenguajes.proyecto.restaurante.modelos.Ingrediente;
import hn.lenguajes.proyecto.restaurante.repositorios.ComidaIngreRepositorio;
import hn.lenguajes.proyecto.restaurante.repositorios.ComidaRepositorio;
import hn.lenguajes.proyecto.restaurante.repositorios.IngredienteRepositorio;
import hn.lenguajes.proyecto.restaurante.servicios.ComidaIngreService;

@Service
public class ComidaIngreServiceImpl implements ComidaIngreService {

    @Autowired
    private ComidaIngreRepositorio comidaIngreRepositorio;

    @Autowired
    private ComidaRepositorio comidaRepositorio;

    @Autowired
    private IngredienteRepositorio ingredienteRepositorio;

    @Override
    public void asociarComidaConIngrediente(int idComida, int idIngrediente) {
        Comida comida = comidaRepositorio.findById(idComida).orElse(null);
        Ingrediente ingrediente = ingredienteRepositorio.findById(idIngrediente).orElse(null);
    
        // Verificar si las entidades existen
        if (comida == null) {
            System.out.println("Comida no encontrada con ID: " + idComida);
        }
    
        if (ingrediente == null) {
            System.out.println("Ingrediente no encontrada con ID: " + idIngrediente);
        }
    
        // Verificar si la relación ya existe
        if (!comidaIngreRepositorio.findByComidaAndIngrediente(comida, ingrediente).isPresent()) {
            // Si no existe, crear la relación
            ComidaIngre comidaIngre = new ComidaIngre();
            comidaIngre.setComida(comida);
            comidaIngre.setIngrediente(ingrediente);
    
            comidaIngreRepositorio.save(comidaIngre);
        }
    }
    

    @Override
    public void desasociarComidaDeIngrediente(int idComida, int idIngrediente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desasociarComidaDeIngrediente'");
    }
    
}

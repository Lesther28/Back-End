package hn.lenguajes.proyecto.restaurante.servicios;

import java.util.List;
import hn.lenguajes.proyecto.restaurante.modelos.Ingrediente;

public interface IngredienteService {
    Ingrediente crearIngrediente(Ingrediente nvoIngrediente);
    String eliminarIngrediente(int idIngrediente);
    List<Ingrediente> obtenerTodos();
}

package hn.lenguajes.proyecto.restaurante.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.proyecto.restaurante.modelos.Comida;
import hn.lenguajes.proyecto.restaurante.modelos.ComidaIngre;
import hn.lenguajes.proyecto.restaurante.modelos.Ingrediente;

public interface ComidaIngreRepositorio extends JpaRepository<ComidaIngre, Integer> {

    Optional<ComidaIngre> findByComidaAndIngrediente(Comida comida, Ingrediente ingrediente);


}


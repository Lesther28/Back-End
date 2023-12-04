package hn.lenguajes.proyecto.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.proyecto.restaurante.modelos.Comida;

public interface ComidaRepositorio extends JpaRepository<Comida, Integer> {
    
}

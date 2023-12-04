package hn.lenguajes.proyecto.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.proyecto.restaurante.modelos.Orden;

public interface OrdenRepositorio extends JpaRepository<Orden, Integer> {
    
}

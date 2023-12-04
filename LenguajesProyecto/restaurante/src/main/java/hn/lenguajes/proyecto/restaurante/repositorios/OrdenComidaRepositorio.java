package hn.lenguajes.proyecto.restaurante.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.proyecto.restaurante.modelos.Comida;
import hn.lenguajes.proyecto.restaurante.modelos.Orden;
import hn.lenguajes.proyecto.restaurante.modelos.OrdenComida;

public interface OrdenComidaRepositorio extends JpaRepository<OrdenComida, Integer> {
    Optional<OrdenComida> findByComidaAndOrden(Comida comida, Orden orden);
}
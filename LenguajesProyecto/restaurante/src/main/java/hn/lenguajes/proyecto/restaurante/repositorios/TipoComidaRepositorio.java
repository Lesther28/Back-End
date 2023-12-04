package hn.lenguajes.proyecto.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.proyecto.restaurante.modelos.TipoComida;

public interface TipoComidaRepositorio extends JpaRepository<TipoComida,Integer> {
    
}

package hn.lenguajes.proyecto.restaurante.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes.proyecto.restaurante.modelos.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
    
}

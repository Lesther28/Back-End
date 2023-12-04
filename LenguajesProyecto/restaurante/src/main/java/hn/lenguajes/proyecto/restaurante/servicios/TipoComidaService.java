package hn.lenguajes.proyecto.restaurante.servicios;

import java.util.List;

import hn.lenguajes.proyecto.restaurante.modelos.TipoComida;

public interface TipoComidaService {
    
    public TipoComida CrearTP (TipoComida nvoTipoComida);

    public String ElimiarTP (int idTP);

    public List<TipoComida> obtenerTodos();
}

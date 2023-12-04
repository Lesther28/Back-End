package hn.lenguajes.proyecto.restaurante.servicios;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import hn.lenguajes.proyecto.restaurante.modelos.Comida;

public interface ComidaService {
    
public Comida CrearComida (Comida nvaComida);

public String EliminarComida (int id_comida);

public List<Comida> ObtenerTodos ();


}

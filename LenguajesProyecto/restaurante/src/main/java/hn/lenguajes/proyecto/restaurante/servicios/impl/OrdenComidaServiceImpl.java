package hn.lenguajes.proyecto.restaurante.servicios.impl;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes.proyecto.restaurante.modelos.Comida;
import hn.lenguajes.proyecto.restaurante.modelos.Orden;
import hn.lenguajes.proyecto.restaurante.modelos.OrdenComida;
import hn.lenguajes.proyecto.restaurante.repositorios.ComidaRepositorio;
import hn.lenguajes.proyecto.restaurante.repositorios.OrdenComidaRepositorio;
import hn.lenguajes.proyecto.restaurante.repositorios.OrdenRepositorio;
import hn.lenguajes.proyecto.restaurante.servicios.OrdenComidaService;
import hn.lenguajes.proyecto.restaurante.servicios.OrdenService;
@Service
public class OrdenComidaServiceImpl implements OrdenComidaService {

    @Autowired
    private OrdenComidaRepositorio ordenComidaRepositorio;

    @Autowired
    private ComidaRepositorio comidaRepositorio;

    @Autowired
    private OrdenRepositorio ordenRepositorio;

 
    @Override
    public String asociarComidaConOrden(int id_comida, int id_orden) {
               Comida comida = comidaRepositorio.findById(id_comida).orElse(null);
        Orden orden = ordenRepositorio.findById(id_orden).orElse(null);


        if (comida == null) {
            return "Comida no encontrada con ID: " + id_comida; 
        }

        if (orden == null) {
            return "Orden no encontrada con ID: " + id_orden;
        }

        if (!ordenComidaRepositorio.findByComidaAndOrden(comida, orden).isPresent()) {

            OrdenComida ordenComida = new OrdenComida();
            ordenComida.setComida(comida);
            ordenComida.setOrden(orden);

            ordenComidaRepositorio.save(ordenComida);
             return "Se ha creado la asociacion entre la comida con id: " + id_comida + "y la orden con id: "+ id_orden; 
        }
return "No se ha creado";
       
    }

    @Override
    public String desasociarComidaDeOrden(int id_comida, int id_orden) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desasociarComidaDeOrden'");
    }

    // Otros métodos según sea necesario
}







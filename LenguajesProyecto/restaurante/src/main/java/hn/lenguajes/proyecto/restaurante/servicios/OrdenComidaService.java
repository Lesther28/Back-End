package hn.lenguajes.proyecto.restaurante.servicios;
import java.util.List;

import hn.lenguajes.proyecto.restaurante.modelos.Comida;
import hn.lenguajes.proyecto.restaurante.modelos.Orden;
import hn.lenguajes.proyecto.restaurante.modelos.OrdenComida;
public interface OrdenComidaService {

     public String asociarComidaConOrden(int id_comida, int id_orden);
     public String desasociarComidaDeOrden(int id_comida, int id_orden);
}

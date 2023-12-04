package hn.lenguajes.proyecto.restaurante.servicios;


public interface ComidaIngreService {
    public void asociarComidaConIngrediente(int idComida, int idIngrediente);
    public void desasociarComidaDeIngrediente(int idComida, int idIngrediente);
}

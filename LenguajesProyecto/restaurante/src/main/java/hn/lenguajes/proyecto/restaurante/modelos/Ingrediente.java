package hn.lenguajes.proyecto.restaurante.modelos;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ingrediente")
@NoArgsConstructor
@AllArgsConstructor
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ingrediente;

    private String nombre;
    
    private int cantidadStock;
    private String unidadMedida;
    
    private String urlImagen;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "comidaingre",
        joinColumns = @JoinColumn(name = "id_ingrediente", referencedColumnName = "id_ingrediente"),
        inverseJoinColumns = @JoinColumn(name = "id_comida", referencedColumnName = "id_comida")
    )
    @JsonIgnore
    private List<Comida> comida = new ArrayList<>();
}


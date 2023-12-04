package hn.lenguajes.proyecto.restaurante.modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="comidaingre")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ComidaIngre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comida_ingre")
    private int idComidaIngre;

    @ManyToOne
    @JoinColumn(name = "id_comida")
    @JsonIgnoreProperties("comidaIngre")
    private Comida comida;

    @ManyToOne
    @JoinColumn(name = "id_ingrediente")
    private Ingrediente ingrediente;
}

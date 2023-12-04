package hn.lenguajes.proyecto.restaurante.modelos;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tipocomida")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TipoComida {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo_comida;
    private String descripcion;
    
    @OneToMany(mappedBy = "tipoComida")
    private List<Comida> comida = new ArrayList<>();
    
}

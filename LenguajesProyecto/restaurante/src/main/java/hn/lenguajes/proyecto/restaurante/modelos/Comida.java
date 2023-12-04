package hn.lenguajes.proyecto.restaurante.modelos;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "comida")
@AllArgsConstructor
@NoArgsConstructor
public class Comida {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_comida;

    private String nombre;
    private int precio;
    
    @Column(name = "url_imagen")
    private String url_imagen;

    @ManyToOne
    @JoinColumn(name = "id_tipo_comida")
    private TipoComida tipoComida;

    //fetch= FetchType.EAGLE
    @ManyToMany(cascade = CascadeType.ALL)
    @JsonBackReference
    @JoinTable (name = "orden_comida", joinColumns = @JoinColumn(name="id_comida", referencedColumnName = "id_comida"),
    inverseJoinColumns =@JoinColumn(name="id_orden", referencedColumnName ="id_orden" ) )
    private List<Orden> orden = new ArrayList<>();
}

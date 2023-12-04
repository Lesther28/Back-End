package hn.lenguajes.proyecto.restaurante.modelos;

import org.hibernate.engine.internal.Cascade;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
@Table(name = "orden")
@AllArgsConstructor
@NoArgsConstructor


public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_orden;

    private int mesa;

    private String descripcion;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;

    @ManyToMany(mappedBy = "orden", cascade = CascadeType.ALL)
    private List<Comida> comida = new ArrayList<>();
}

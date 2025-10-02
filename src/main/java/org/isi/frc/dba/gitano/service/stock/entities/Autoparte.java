package org.isi.frc.dba.gitano.service.stock.entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Autoparte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String codigo;

    private String descripcion;

    @Column(name = "parte_motor")
    private boolean parteMotor;

    @Column(name = "precio_unitario")
    private double precioUnitario;

    private int stock;

    @OneToMany(mappedBy = "autoparte", fetch = FetchType.LAZY)
    private Set<Auto> autos = new HashSet<>();

    @OneToMany(mappedBy = "autoparte", fetch = FetchType.LAZY)
    private Set<Pais> paises = new HashSet<>();


}

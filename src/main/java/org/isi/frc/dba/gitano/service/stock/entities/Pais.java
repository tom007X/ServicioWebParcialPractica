package org.isi.frc.dba.gitano.service.stock.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String nombre;

    @ManyToOne
    @JoinColumn(name = "autoparte_id")
    private Autoparte autoparte;
}

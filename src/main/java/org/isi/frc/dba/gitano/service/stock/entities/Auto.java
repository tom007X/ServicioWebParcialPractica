package org.isi.frc.dba.gitano.service.stock.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String marca;
    private String modelo;
    private String version;

    @ManyToOne
    @JoinColumn(name = "autoparte_id")
    private Autoparte autoparte;


}

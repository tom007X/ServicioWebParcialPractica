package org.isi.frc.dba.gitano.service.stock.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class Autoparte {

    @Id
    private int id;

    @Basic
    private String codigo;

    @Basic
    private String descripcion;

    @Column(name = "parte_motor")
    private boolean parteMotor;

    @Column(name = "precio_unitario")
    private double precioUnitario;

    @Basic
    private int stock;


}

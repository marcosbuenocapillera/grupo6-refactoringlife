package com.refactoringlife.grupo6.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id_marca")
    private Long id;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "fecha_baja")
    private LocalDateTime fechabaja;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(Timestamp fechabaja) {
        this.fechabaja = fechabaja.toLocalDateTime();
    }
}

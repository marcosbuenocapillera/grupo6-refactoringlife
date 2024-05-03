package com.refactoringlife.grupo6.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "tipo_producto")
public class TipoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_producto")
    private Long id;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "fecha_baja")
    private Timestamp fechaBaja;
    @OneToMany(mappedBy = "tipoProducto")
    private List<Producto> productos;

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

    public Timestamp getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Timestamp fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

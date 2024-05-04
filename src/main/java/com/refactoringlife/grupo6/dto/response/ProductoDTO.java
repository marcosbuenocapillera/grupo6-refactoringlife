package com.refactoringlife.grupo6.dto.response;

import com.refactoringlife.grupo6.model.Producto;

import java.io.Serializable;
import java.util.List;

public class ProductoDTO implements Serializable {
    private Long idProducto;
    private String nombre;
    public Long getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

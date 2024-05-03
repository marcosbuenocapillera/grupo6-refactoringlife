package com.refactoringlife.grupo6.controller;

import com.refactoringlife.grupo6.model.TipoProducto;
import com.refactoringlife.grupo6.service.TipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TipoProductoController {
    @Autowired
    private TipoProductoService tipoProductoService;

    @GetMapping("/obtenerTodosTiposProductos")
    public List<TipoProducto> obtenerTodosTiposProductos(){
        return tipoProductoService.obtenerTodosTiposProducto();
    }

    @PostMapping("/crearTipoProducto")
    public TipoProducto crearTipoProducto(@RequestBody TipoProducto tipoProducto){
        return tipoProductoService.crearTipoProducto(tipoProducto);
    }

    @GetMapping("/obtenerTipoProducto/{id}")
    public Optional<TipoProducto> obtenerTipoProducto(@PathVariable Long id){
        return tipoProductoService.obtenerTipoProducto(id);
    }

    @DeleteMapping("/eliminarTipoProducto/{id}")
    public void eliminarTipoProducto(@PathVariable Long id){
        tipoProductoService.eliminarTipoProducto(id);
    }
}

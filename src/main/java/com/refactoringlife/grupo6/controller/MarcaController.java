package com.refactoringlife.grupo6.controller;

import com.refactoringlife.grupo6.model.Marca;
import com.refactoringlife.grupo6.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    @GetMapping("/obtenerTodasMarca")
    public ResponseEntity<List<Marca>> obtenerTodasMarca() {
        List<Marca> marcas = marcaService.obtenerTodasMarca();
        return ResponseEntity.ok(marcas);
    }

    @PostMapping("/crearMarca")
    public ResponseEntity<Marca> crearMarca(@RequestBody Marca marca) {
        Marca createdMarca = marcaService.crearMarca(marca);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMarca);
    }

    @PutMapping("/actualizarMarca/{id}")
    public Marca actualizarMarca(@PathVariable Long id, @RequestBody Marca marca) {
        marca.setId(id);
        return marcaService.actualizarMarca(marca);
    }
    @PatchMapping("/eliminarMarca/{id}")
    public ResponseEntity<Marca> eliminarMarca(@PathVariable Long id) {
        marcaService.eliminarMarca(id);
        return ResponseEntity.noContent().build();
    }
}
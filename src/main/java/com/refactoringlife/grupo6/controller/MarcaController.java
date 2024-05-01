package com.refactoringlife.grupo6.controller;

import com.refactoringlife.grupo6.model.Marca;
import com.refactoringlife.grupo6.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MarcaController {
    @Autowired
    private MarcaService marcaService;
    @PatchMapping("/eliminarMarca/{id}")
    public ResponseEntity<Marca> eliminarMarca(@PathVariable Long id) {
        marcaService.eliminarMarca(id);
        return ResponseEntity.noContent().build();
    }
}
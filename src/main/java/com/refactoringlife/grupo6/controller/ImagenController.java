package com.refactoringlife.grupo6.controller;

import com.refactoringlife.grupo6.model.Imagen;
import com.refactoringlife.grupo6.service.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ImagenController {

    @Autowired
    private ImagenService imagenService;

    @GetMapping("/obtenerTodasImagenes")
    public List<Imagen> obtenerTodasImagenes() {
        return imagenService.obtenerTodasImagenes();
    }

    @PostMapping("/crearImagen")
    public Imagen crearImagen(@RequestBody Imagen imagen) {
        return imagenService.crearImagen(imagen);
    }

    @PutMapping("/actualizarImagen/{id}")
    public Imagen actualizarImagen(@PathVariable Long id, @RequestBody Imagen imagen) {
        imagen.setId(id);
        return imagenService.actualizarImagen(imagen);
    }

    @DeleteMapping("/eliminarImagen/{id}")
    public void eliminarImagen(@PathVariable Long id) {
        imagenService.eliminarImagen(id);
    }

    @GetMapping("/obtenerImagen/{id}")
    public Optional<Imagen> obtenerImagen(@PathVariable Long id) {
        return imagenService.obtenerImagen(id);
    }

}

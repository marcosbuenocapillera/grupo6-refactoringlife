package com.refactoringlife.grupo6.service;

import com.refactoringlife.grupo6.model.Imagen;
import com.refactoringlife.grupo6.repository.ImagenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImagenService {
    @Autowired
    private ImagenRepository imagenRepository;

    public List<Imagen> obtenerTodasImagenes() {
        return imagenRepository.findAll();
    }

    public Imagen crearImagen(Imagen imagen) {
        return imagenRepository.save(imagen);
    }

    public Imagen actualizarImagen(Imagen imagen) {
        return imagenRepository.save(imagen);
    }

    public void eliminarImagen(Long id) {
        imagenRepository.deleteById(id);
    }

    public Optional<Imagen> obtenerImagen(Long id) {
        return imagenRepository.findById(id);
    }
}

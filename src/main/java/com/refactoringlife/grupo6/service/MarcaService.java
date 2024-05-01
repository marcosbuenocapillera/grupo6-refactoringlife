package com.refactoringlife.grupo6.service;

import com.refactoringlife.grupo6.model.Marca;
import com.refactoringlife.grupo6.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> obtenerTodasMarca() {
        return marcaRepository.findAll();
    }

    public Marca crearMarca(Marca marca) {
        return marcaRepository.save(marca);
    }

    public Marca actualizarMarca(Marca marca){
        return marcaRepository.save(marca);
    }
    public void eliminarMarca(Long id) {
        marcaRepository.findById(id).ifPresent(marca -> {
            marca.setFechabaja(null);
            marcaRepository.save(marca);
        });
    }
}

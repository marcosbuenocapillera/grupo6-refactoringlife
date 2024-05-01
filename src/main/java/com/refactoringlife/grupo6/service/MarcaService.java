package com.refactoringlife.grupo6.service;

import com.refactoringlife.grupo6.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;
    public void eliminarMarca(Long id) {
        marcaRepository.findById(id).ifPresent(marca -> {
            marca.setFechabaja(null);
            marcaRepository.save(marca);
        });
    }
}

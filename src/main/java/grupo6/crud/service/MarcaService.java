package grupo6.crud.service;

import grupo6.crud.Marca;
import grupo6.crud.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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

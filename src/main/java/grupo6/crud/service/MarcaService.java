package grupo6.crud.service;

import grupo6.crud.Marca;
import grupo6.crud.repository.MarcaRepository;
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




}

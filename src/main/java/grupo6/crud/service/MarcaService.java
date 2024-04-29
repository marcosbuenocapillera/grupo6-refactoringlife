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

    public List<Marca> obtenerTodasMarca() {
        List<Marca> todasLasMarcas = marcaRepository.findAll();

        List<Marca> marcasConFechaBajaNoNula = new ArrayList<>();
        for (Marca marca : todasLasMarcas) {
            if (marca.getFechabaja() != null) {
                marcasConFechaBajaNoNula.add(marca);
            }
        }

        return marcasConFechaBajaNoNula;
    }


    public Marca crearMarca(Marca marca) {
        return marcaRepository.save(marca);
    }

    public void eliminarMarca(Long id) {
        System.out.println("Eliminando marca con id: " + id);
        marcaRepository.findById(id).ifPresent(marca -> {
            System.out.println("Marca encontrada: " + marca);
            marca.setFechabaja(null);
            marcaRepository.save(marca);

        });
    }
}

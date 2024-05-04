package com.refactoringlife.grupo6.service;

import com.refactoringlife.grupo6.model.TipoProducto;
import com.refactoringlife.grupo6.repository.TipoProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TipoProductoService {
    @Autowired
    private TipoProductoRepository tipoProductoRepository;
    public List<TipoProducto> obtenerTodosTiposProducto(){
        return tipoProductoRepository.findAll();
    }

    public TipoProducto crearTipoProducto(TipoProducto tipoProducto){
        return tipoProductoRepository.save(tipoProducto);
    }

    public Optional<TipoProducto> obtenerTipoProducto(Long id){
        return tipoProductoRepository.findById(id);
    }

    public void eliminarTipoProducto(Long id){
        Optional<TipoProducto> tipoProductoOptional = tipoProductoRepository.findById(id);
        tipoProductoOptional.ifPresent(tipoProducto -> {
            tipoProducto.setFechaBaja(new Timestamp(System.currentTimeMillis()));
            tipoProductoRepository.save(tipoProducto);
        });
    }
}

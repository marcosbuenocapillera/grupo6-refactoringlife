package com.refactoringlife.grupo6.service;

import com.refactoringlife.grupo6.dto.response.GetProductoDTO;
import com.refactoringlife.grupo6.dto.response.ProductoDTO;
import com.refactoringlife.grupo6.mapper.ProductMapper;
import com.refactoringlife.grupo6.model.Producto;
import com.refactoringlife.grupo6.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private ProductMapper productMapper;

    public GetProductoDTO getProductoDTO() {
        List<Producto> productos = productoRepository.findAll();
        //List<ProductoDTO> listProductosDTO = productos.stream().map(lista -> productMapper.toDTO(lista)).toList()

        List<ProductoDTO> listaProductosDTO = new ArrayList<>();

        for (Producto producto : productos) {
            ProductoDTO productoDTO = new ProductoDTO();
            productoDTO.setIdProducto(producto.getIdProducto());
            productoDTO.setNombre(producto.getNombre());
            listaProductosDTO.add(productoDTO);
        }

        GetProductoDTO dto = new GetProductoDTO();
        dto.setListProduct(listaProductosDTO);
        return ResponseEntity.ok(dto).getBody();
    }

    public List<Producto> obtenerTodosProductos() {
        return productoRepository.findAll();
    }

    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto actualizarProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public void eliminarProducto(Long id){
        productoRepository.deleteById(id);
    }
}

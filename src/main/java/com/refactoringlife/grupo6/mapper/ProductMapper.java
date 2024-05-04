package com.refactoringlife.grupo6.mapper;

import com.refactoringlife.grupo6.dto.response.ProductoDTO;
import org.springframework.stereotype.Component;
@Component
public class ProductMapper {
   public  ProductoDTO toDTO(Long idProducto, String nombre){
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setIdProducto(idProducto);
        productoDTO.setNombre(nombre);
        return  productoDTO;
    }
}


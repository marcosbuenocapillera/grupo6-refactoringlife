package com.refactoringlife.grupo6.controller;


import com.refactoringlife.grupo6.dto.response.GetProductoDTO;
import com.refactoringlife.grupo6.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/getListProductosPorNombrePorId")
    public GetProductoDTO getListProductosPorNombrePorId(){
        return productoService.getProductoDTO();
    }

}

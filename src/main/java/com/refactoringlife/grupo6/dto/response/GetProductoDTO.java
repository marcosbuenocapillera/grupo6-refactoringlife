package com.refactoringlife.grupo6.dto.response;

import com.refactoringlife.grupo6.model.Producto;

import java.io.Serializable;
import java.util.List;

public class GetProductoDTO implements Serializable {

    public List<ProductoDTO> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<ProductoDTO> listProduct) {
        this.listProduct = listProduct;
    }

    private List<ProductoDTO> listProduct;
}


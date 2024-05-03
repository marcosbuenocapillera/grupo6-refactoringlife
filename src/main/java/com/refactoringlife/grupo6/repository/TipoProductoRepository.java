package com.refactoringlife.grupo6.repository;

import com.refactoringlife.grupo6.model.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoProductoRepository extends JpaRepository<TipoProducto, Long> {
}

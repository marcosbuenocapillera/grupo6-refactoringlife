package com.refactoringlife.grupo6.repository;

import com.refactoringlife.grupo6.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}

package com.refactoringlife.grupo6.repository;

import com.refactoringlife.grupo6.model.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagenRepository extends JpaRepository<Imagen, Long> {
}

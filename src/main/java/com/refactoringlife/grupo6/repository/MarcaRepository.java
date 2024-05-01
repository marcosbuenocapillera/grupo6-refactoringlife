package com.refactoringlife.grupo6.repository;

import com.refactoringlife.grupo6.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
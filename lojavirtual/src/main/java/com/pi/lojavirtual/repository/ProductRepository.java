package com.pi.lojavirtual.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pi.lojavirtual.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByNomeContainingIgnoreCase(String nome, Pageable pageable);
    Page<Product> findAllByOrderByIdDesc(Pageable pageable);
    Page<Product> findByNomeContainingIgnoreCaseAndAtivoTrue(String nome, Pageable pageable);
}

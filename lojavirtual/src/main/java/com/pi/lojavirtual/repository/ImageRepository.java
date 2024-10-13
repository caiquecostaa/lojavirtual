package com.pi.lojavirtual.repository;

import com.pi.lojavirtual.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByProdutoId(Long produtoId);
}

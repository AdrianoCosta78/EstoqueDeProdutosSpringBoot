package com.estoque.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estoque.estoque.models.ProdutosModel;


@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {

}

package com.estoque.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estoque.estoque.models.FornecedorModel;


@Repository
public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long> {

}



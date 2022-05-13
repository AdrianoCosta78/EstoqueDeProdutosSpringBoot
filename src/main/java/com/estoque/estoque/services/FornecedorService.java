package com.estoque.estoque.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estoque.estoque.models.FornecedorModel;
import com.estoque.estoque.repository.FornecedorRepository;

@Service
public class FornecedorService {




	@Autowired
	private FornecedorRepository fornecedorRepository;

	public FornecedorModel findById(Long id) {
		Optional<FornecedorModel> produto = fornecedorRepository.findById(id);
		return produto.orElse(null);
		
	}

	public List<FornecedorModel> findAll() {
		return fornecedorRepository.findAll();
	}

	public FornecedorModel editar(Long id, FornecedorModel fornecedor) {
		FornecedorModel newFornecedor = findById(id);
		newFornecedor.setNomeFornecedor(fornecedor.getNomeFornecedor());
		newFornecedor.setDataCriacao(fornecedor.getDataCriacao());
		newFornecedor.setUltimaAtualizacao(fornecedor.getUltimaAtualizacao());
		return fornecedorRepository.save(newFornecedor);
		
	}

	public FornecedorModel inserir(FornecedorModel fornecedor) {
		fornecedor.setIdFornecedor(null);
		return fornecedorRepository.save(fornecedor);
	}

	public void excluir(Long id) {
		findById(id);
		fornecedorRepository.deleteById(id);
		
	}

}

 
	
package com.estoque.estoque.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estoque.estoque.models.ProdutosModel;
import com.estoque.estoque.repository.ProdutosRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutosRepository produtosRepository;

	public ProdutosModel findById(Long id) {
		Optional<ProdutosModel> produto = produtosRepository.findById(id);
		return produto.orElse(null);
		
	}

	public List<ProdutosModel> findAll() {
		return produtosRepository.findAll();
	}

	public ProdutosModel editar(Long id, ProdutosModel produto) {
		ProdutosModel newProduto = findById(id);
		newProduto.setNomeProduto(produto.getNomeProduto());
		newProduto.setMedidasModel(produto.getMedidasModel());
		newProduto.setPrecoProduto(produto.getPrecoProduto());
		newProduto.setQuantidadeProduto(produto.getQuantidadeProduto());
		newProduto.setDataAtualizacao(produto.getDataAtualizacao());
		newProduto.setDataCriacao(produto.getDataCriacao());
		return produtosRepository.save(newProduto);
		
	}

	public ProdutosModel inserir(ProdutosModel produto) {
		//produto.setId();
		return produtosRepository.save(produto);
	}

	public void excluir(Long id) {
		findById(id);
		produtosRepository.deleteById(id);
		
	}

}

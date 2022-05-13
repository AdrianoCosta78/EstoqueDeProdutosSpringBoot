package com.estoque.estoque.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estoque.estoque.models.ProdutosModel;
import com.estoque.estoque.services.ProdutoService;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResources {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProdutosModel> findById(@PathVariable Long id){
		ProdutosModel produto = this.produtoService.findById(id);
		return ResponseEntity.ok().body(produto);
	}
	
	@GetMapping
	public ResponseEntity<List<ProdutosModel>> findAll(){
		List<ProdutosModel> list = produtoService.findAll();
		return ResponseEntity.ok().body(list);
	}
		
	@PutMapping(value = "/{id}")
	public ResponseEntity<ProdutosModel> editar(@PathVariable Long id, @RequestBody ProdutosModel produto){
		ProdutosModel newProduto = produtoService.editar(id, produto);
		return ResponseEntity.ok().body(newProduto);
	}
	
	@PostMapping
	public ResponseEntity<ProdutosModel> inserir(@RequestBody ProdutosModel produto){
		ProdutosModel newProduto = produtoService.inserir(produto);
		return ResponseEntity.ok().body(newProduto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> excluir(@PathVariable Long id){
		produtoService.excluir(id);
		return ResponseEntity.noContent().build();
	}
		
	}
	



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

import com.estoque.estoque.models.FornecedorModel;
import com.estoque.estoque.services.FornecedorService;
import com.estoque.estoque.services.ProdutoService;

@RestController
@RequestMapping(value = "/fornecedor")
public class FornecedorResources {





@Autowired
	private FornecedorService fornecedorService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<FornecedorModel> findById(@PathVariable Long id){
		FornecedorModel fornecedor = this.fornecedorService.findById(id);
		return ResponseEntity.ok().body(fornecedor);
	}

	@GetMapping
	public ResponseEntity<List<FornecedorModel>> findAll(){
		List<FornecedorModel> list = fornecedorService.findAll();
		return ResponseEntity.ok().body(list);
	}
		
	@PutMapping(value = "/{id}")
	public ResponseEntity<FornecedorModel> editar(@PathVariable Long id, @RequestBody FornecedorModel fornecedor){
		FornecedorModel newFornecedor = fornecedorService.editar(id, fornecedor);
		return ResponseEntity.ok().body(newFornecedor);
	}
	
	@PostMapping
	public ResponseEntity<FornecedorModel> inserir(@RequestBody FornecedorModel fornecedor){
		FornecedorModel newFornecedor = fornecedorService.inserir(fornecedor);
		return ResponseEntity.ok().body(newFornecedor);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> excluir(@PathVariable Long id){
		fornecedorService.excluir(id);
		return ResponseEntity.noContent().build();
	}

	
}
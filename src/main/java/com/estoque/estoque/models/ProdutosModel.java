package com.estoque.estoque.models;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

@Entity
public class ProdutosModel {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NonNull
	@Size(min = 3, message = "O nome deve ter no mínimo 3 caracteres")
	private String nomeProduto;
	@NonNull
	private Byte quantidadeProduto;
	@NonNull
	private String precoProduto;
	@Basic
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataCriacao;
	@Basic
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataAtualizacao;
	@Enumerated(EnumType.STRING)
	private MedidasModel medidasModel;
	
	
	public ProdutosModel() {
		
	}


	public ProdutosModel(long id, @Size(min = 3, message = "O nome deve ter no mínimo 3 caracteres") String nomeProduto,
			Byte quantidadeProduto, String precoProduto, Date dataCriacao, Date dataAtualizacao,
			MedidasModel medidasModel) {
		super();
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.quantidadeProduto = quantidadeProduto;
		this.precoProduto = precoProduto;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
		this.medidasModel = medidasModel;
	}


	public long getId() {
		return id;
	}


	
	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public Byte getQuantidadeProduto() {
		return quantidadeProduto;
	}


	public void setQuantidadeProduto(Byte quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}


	public String getPrecoProduto() {
		return precoProduto;
	}


	public void setPrecoProduto(String precoProduto) {
		this.precoProduto = precoProduto;
	}


	public Date getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}


	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}


	public MedidasModel getMedidasModel() {
		return medidasModel;
	}


	public void setMedidasModel(MedidasModel medidasModel) {
		this.medidasModel = medidasModel;
	}


	public void setId() {
		// TODO Auto-generated method stub
		
	}
	
	

}

package br.com.jeffe.livraria.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import br.com.jeffe.livraria.domain.Categoria;

public class CategoriaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String descricao;
	
	public CategoriaDTO(Categoria obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}

	public CategoriaDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static List<CategoriaDTO> converter(List<Categoria> categoria) {
		return categoria.stream().map(CategoriaDTO::new).collect(Collectors.toList());
	}
	
	
}

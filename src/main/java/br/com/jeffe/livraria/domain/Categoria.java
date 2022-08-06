package br.com.jeffe.livraria.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;

@Entity @Getter
public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	
	@OneToMany(mappedBy = "categoria")
	private List<Livro> livros = new ArrayList<>();

	public Categoria(Long id, String nome, String descricao, List<Livro> livros) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.livros = livros;
	}

	public Categoria(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}
	

	public Categoria() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}
	
}


	
package br.com.jeffe.livraria.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Categoria {
	private Long id;
	private String nome;
	private String Descricao;
	
	private List<Livro> livros = new ArrayList<>();

	public Categoria(Long id, String nome, String descricao, List<Livro> livros) {
		super();
		this.id = id;
		this.nome = nome;
		Descricao = descricao;
		this.livros = livros;
	}

	public Categoria(String nome, String descricao, List<Livro> livros) {
		super();
		this.nome = nome;
		Descricao = descricao;
		this.livros = livros;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public List<Livro> getLivros() {
		return livros;
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


	
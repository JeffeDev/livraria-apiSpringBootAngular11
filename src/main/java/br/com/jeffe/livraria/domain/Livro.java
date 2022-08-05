package br.com.jeffe.livraria.domain;

import java.util.Objects;

public class Livro {
	private Long id;
	private String titulo;
	private String nomeAutor;
	private String texto;
	
	private Categoria categoria;

	public Livro(Long id, String titulo, String nomeAutor, String texto, Categoria categoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.nomeAutor = nomeAutor;
		this.texto = texto;
		this.categoria = categoria;
	}

	public Livro(String titulo, String nomeAutor, String texto, Categoria categoria) {
		super();
		this.titulo = titulo;
		this.nomeAutor = nomeAutor;
		this.texto = texto;
		this.categoria = categoria;
	}

	public Livro() {
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public String getTexto() {
		return texto;
	}

	public Categoria getCategoria() {
		return categoria;
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
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}

package br.com.jeffe.livraria.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import br.com.jeffe.livraria.domain.Categoria;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
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

	public static List<CategoriaDTO> converter(List<Categoria> categoria) {
		return categoria.stream().map(CategoriaDTO::new).collect(Collectors.toList());
	}
	
}

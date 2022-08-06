package br.com.jeffe.livraria.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import br.com.jeffe.livraria.domain.Categoria;
import br.com.jeffe.livraria.services.CategoriaService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data @Getter @Setter @AllArgsConstructor
public class CategoriaFormDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message = "Campo nome não pode ser deixado em Branco")
	private String nome;
	
	@NotEmpty(message = "Campo Descrição não pode ser deixado em branco")
	private String descricao;

	public Categoria converter(CategoriaService categoriaService) {
		return new Categoria(nome, descricao);
	}	
}

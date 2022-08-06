package br.com.jeffe.livraria.services;

import java.util.Arrays;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jeffe.livraria.domain.Categoria;
import br.com.jeffe.livraria.domain.Livro;
import br.com.jeffe.livraria.repositories.CategoriaReposotory;
import br.com.jeffe.livraria.repositories.LivroReposotory;

@Service
public class DBServices {
	
	@Autowired
	private CategoriaReposotory categoriaRepository;
	
	@Autowired	
	private LivroReposotory livroRepository;

	public void instanciaBaseDeDados() {
		
		Categoria categoriaTI = new Categoria( "Informática", "Livros de TI");
		Categoria categoriaAutoAjuda = new Categoria( "Auto-ajuda", "Livros de Auto-Ajuda");
		
		Livro livro1 = new Livro( "Microsserviços", "Susan J. Fowler", "Construindo sistemas padronizados em uma organização de engenharia de Softwares", categoriaTI); 
		Livro livro2 = new Livro( "Revolucione sua qualidade de vida", "Augusto Cury", "Navegando nas águas da emoção", categoriaAutoAjuda);		
		Livro livro3 = new Livro( "Java", "Pedro Silveira", "Conheça as novidades do Java 8 e as novas versões do Java", categoriaTI); 
		Livro livro4 = new Livro( "Judaismo Messiânico", "Deborah Hornblas Travassos", "Instrumentos de Legitimação: a reinvenção do judaísmo ou uma nova religião?", categoriaAutoAjuda);		
		
		this.categoriaRepository.saveAll(Arrays.asList(categoriaTI, categoriaAutoAjuda));
		this.livroRepository.saveAll(Arrays.asList(livro1, livro2, livro3, livro4));

	}
}

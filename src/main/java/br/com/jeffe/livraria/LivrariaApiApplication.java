package br.com.jeffe.livraria;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.jeffe.livraria.domain.Categoria;
import br.com.jeffe.livraria.domain.Livro;
import br.com.jeffe.livraria.repositories.CategoriaReposotory;
import br.com.jeffe.livraria.repositories.LivroReposotory;

@SpringBootApplication
public class LivrariaApiApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaReposotory categoriaRepository;
	
	@Autowired
	private LivroReposotory livroRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(LivrariaApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria( "Informática", "Livros de TI");
		Categoria cat2 = new Categoria( "Auto-ajuda", "Livros de Auto-Ajuda");
		
		Livro livro1 = new Livro( "Microsserviços", "Susan J. Fowler", "Construindo sistemas padronizados em uma organização de engenharia de Softwares", cat1); 
		Livro livro2 = new Livro( "Revolucione sua qualidade de vida", "Augusto Cury", "Navegando nas águas da emoção", cat2);		
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		this.livroRepository.saveAll(Arrays.asList(livro1, livro2));
		
		
	}

}

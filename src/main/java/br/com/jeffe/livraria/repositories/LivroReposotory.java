package br.com.jeffe.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jeffe.livraria.domain.Livro;

public interface LivroReposotory extends JpaRepository<Livro, Long>{

}

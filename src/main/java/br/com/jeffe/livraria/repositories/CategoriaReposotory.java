package br.com.jeffe.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jeffe.livraria.domain.Categoria;

public interface CategoriaReposotory extends JpaRepository<Categoria, Long>{

}

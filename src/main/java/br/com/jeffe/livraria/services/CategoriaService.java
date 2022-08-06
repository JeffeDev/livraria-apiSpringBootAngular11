package br.com.jeffe.livraria.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jeffe.livraria.domain.Categoria;
import br.com.jeffe.livraria.repositories.CategoriaReposotory;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaReposotory categoriaRepository;
	
	public Categoria findById(Long id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElse(null);
	}


}

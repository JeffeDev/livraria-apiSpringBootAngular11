package br.com.jeffe.livraria.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jeffe.livraria.domain.Categoria;
import br.com.jeffe.livraria.dto.CategoriaFormDTO;
import br.com.jeffe.livraria.repositories.CategoriaReposotory;
import br.com.jeffe.livraria.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaReposotory categoriaRepository;
	
	public Categoria findById(Long id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrada Id=" + id + ", Tipo: "+ Categoria.class.getName()));
	}

	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}

	public void save(Categoria categoria) {
		categoriaRepository.save(categoria);
	}

	public Categoria update(Long id, @Valid CategoriaFormDTO formApi) {
		Categoria obj = (findById(id));
		obj.setNome(formApi.getNome());
		obj.setDescricao(formApi.getDescricao());
		return categoriaRepository.save(obj);
	}


}

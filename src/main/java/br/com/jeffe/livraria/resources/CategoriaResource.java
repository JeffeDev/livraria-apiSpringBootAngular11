package br.com.jeffe.livraria.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jeffe.livraria.domain.Categoria;
import br.com.jeffe.livraria.services.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> pesquisarPorId(@PathVariable Long id) {
		Categoria objCategoria = categoriaService.findById(id);
		return ResponseEntity.ok().body(objCategoria);
	}
	
}

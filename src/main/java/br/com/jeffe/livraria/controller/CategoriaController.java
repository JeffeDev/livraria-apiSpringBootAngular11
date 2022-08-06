package br.com.jeffe.livraria.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.jeffe.livraria.domain.Categoria;
import br.com.jeffe.livraria.dto.CategoriaDTO;
import br.com.jeffe.livraria.dto.CategoriaFormDTO;
import br.com.jeffe.livraria.services.CategoriaService;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> pesquisarPorId(@PathVariable Long id) {
		Categoria objCategoria = categoriaService.findById(id);
		return ResponseEntity.ok().body(objCategoria);
	}
	
	@GetMapping
	public List<CategoriaDTO> lista(){
		List<Categoria> categoria = categoriaService.findAll();
		return CategoriaDTO.converter(categoria);
	}
	
	@PostMapping
	public ResponseEntity<CategoriaDTO> criarCategoria(@RequestBody @Valid CategoriaFormDTO formApi, UriComponentsBuilder uriBuilder){
		Categoria categoria = formApi.converter(categoriaService);
		categoriaService.save(categoria);
		
		URI uri = uriBuilder.path("/categoria/{id}").buildAndExpand(categoria.getId()).toUri();
		return ResponseEntity.created(uri).body(new CategoriaDTO(categoria));
	}

	@PostMapping("/{id}")
	public ResponseEntity<CategoriaDTO> alterarCategoria(@PathVariable Long id, @RequestBody @Valid CategoriaFormDTO objDTO){
		Categoria updateObj = categoriaService.update(id, objDTO);
		return ResponseEntity.ok().body(new CategoriaDTO(updateObj));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deletarCategoria(@PathVariable Long id){
		categoriaService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}

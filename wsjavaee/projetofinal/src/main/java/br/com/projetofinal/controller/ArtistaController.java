package br.com.projetofinal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.dao.ArtistaDAO;
import br.com.projetofinal.model.Artista;

@RestController
@CrossOrigin("*")
public class ArtistaController {

	@Autowired
	private ArtistaDAO artdao;

	@GetMapping("/artpesq")
	public ResponseEntity<List<Artista>> getAllArtista(){
		ArrayList<Artista> lista = (ArrayList<Artista>) artdao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}else {
			return ResponseEntity.ok(lista);
		}
	}

	@GetMapping("/artpesqnac/{nacionalidade}")
	public ResponseEntity<List<Artista>> getNacionalidade(@PathVariable String nacionalidade){
		ArrayList<Artista> lista = artdao.findBynacionalidade(nacionalidade);
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}else {
			return ResponseEntity.ok(lista);
		}
	}

	@GetMapping("/artpesqcod/{codigo}")
	public ResponseEntity<Artista> getAllArtistaStatus(@PathVariable int codigo){
		Artista artista = artdao.findById(codigo).orElse(null);
		if (artista==null) {
			return ResponseEntity.status(404).build();
		}else {
			return ResponseEntity.ok(artista);
		}
	}

	@PostMapping("/artinsert")
	public ResponseEntity<Artista> insertArtista(@RequestBody Artista artista){
		try {
			Artista art = artdao.save(artista);
			return ResponseEntity.ok(art);	
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}

	}


}

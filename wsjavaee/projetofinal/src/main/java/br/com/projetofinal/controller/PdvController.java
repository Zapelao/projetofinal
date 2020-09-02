package br.com.projetofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.dao.PdvDAO;
import br.com.projetofinal.model.Pdv;

@RestController
@CrossOrigin("*")
public class PdvController {


	@Autowired
	private PdvDAO pdvdao;

	@PostMapping("/pdv/newpdv")
	public ResponseEntity<Pdv> insertPdv(@RequestBody Pdv pdv){
		try {
			Pdv retorno = pdvdao.save(pdv);
			return ResponseEntity.ok(retorno);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
	}

}

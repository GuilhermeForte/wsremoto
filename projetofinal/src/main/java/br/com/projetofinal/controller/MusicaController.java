package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.dao.ArtistaDAO;
import br.com.projetofinal.dao.MusicaDAO;
import br.com.projetofinal.model.Musica;

@RestController
@CrossOrigin("*")
public class MusicaController {
	@Autowired
	private MusicaDAO mdao;
	@Autowired
	private ArtistaDAO adao;
	
	@PostMapping("/newmusica")
	public ResponseEntity<Musica> addm(@RequestBody Musica objeto){
		try {
			mdao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			System.out.println(e);
			return ResponseEntity.status(500).build();
		}
	}
	
	@GetMapping("/musicas")
	public ResponseEntity<List<Musica>> getAll(){
		List<Musica> lista=(List<Musica>)mdao.findAll();
		if(lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}

}

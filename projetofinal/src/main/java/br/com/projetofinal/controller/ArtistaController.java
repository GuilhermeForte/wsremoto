package br.com.projetofinal.controller;

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
import br.com.projetofinal.dao.MusicaDAO;
import br.com.projetofinal.model.Artista;

@RestController
@CrossOrigin("*")
public class ArtistaController {
	@Autowired
	private MusicaDAO mdao;
	@Autowired
	private ArtistaDAO adao;

	@PostMapping("/novoartista")
	public ResponseEntity<Artista> adda(@RequestBody Artista objeto){
		try {
			adao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			System.out.println(e);
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> getAll(){
		List<Artista> lista=(List<Artista>) adao.findAll();
		if(lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/artista/{id}")
	public ResponseEntity<Artista>getArtista(@PathVariable int id){
		Artista resposta=adao.findById(id).orElse(null);
		if(resposta==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}

}

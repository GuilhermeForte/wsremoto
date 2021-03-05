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

import br.com.projetofinal.dao.UsuarioDAO;
import br.com.projetofinal.model.Usuario;

@RestController // Aponta para o Spring que esta classe respondera as requisiçoes http
@CrossOrigin("*") // Libera para o acesso externo do servidor
public class UsuarioController {

	@Autowired //JPA gerencia o atributo "dao" que foi criado
	private UsuarioDAO dao;
	
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario usuario){
		Usuario resposta=dao.findByEmailAndSenha(usuario.getEmail(),usuario.getSenha());
		if(resposta==null) {
			return ResponseEntity.status(403).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<Usuario> getUser(@PathVariable int id ){
	Usuario objeto=dao.findById(id).orElse(null);
	if(objeto==null) {
		return ResponseEntity.status(404).build();
	}
	return ResponseEntity.ok(objeto);	
}
	
	@PostMapping("/postuser")
	public ResponseEntity<Usuario> getUser(@RequestBody Usuario usuario ){
		Usuario objeto=dao.findById(usuario.getId()).orElse(null);
		if(objeto==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(objeto);
	}

	@GetMapping("/usuarios")
	public ResponseEntity< List<Usuario>> getAll(){
		List<Usuario> lista=(List<Usuario>)dao.findAll();
		if(lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}

}

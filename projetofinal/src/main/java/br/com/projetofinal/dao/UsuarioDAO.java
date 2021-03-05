package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.model.Usuario;
/*
 * DAO (Data Access Object) => pattern que representa a camada do projeto onde deve ser colocado o CRUD (Create, Read, Update, Delete)
 */

public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {
	
	public Usuario findByEmailAndSenha(String email, String senha);
		
	
	/*
	 * save(): grava/altera os dados
	 * findAll(): retorna todos os dados
	 * findById(): retorna um usuario com o Id
	 * deleteById(): apaga um usuario de acordo com o Id
	 */

}

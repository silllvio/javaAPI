package com.apirest.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

	
	public UserEntity findByEmail(String email);
	
	// Palava chave para busca "findBy".
//	O atributo deve existir na entidade.
		
		
	public List<UserEntity> findByEmailOrName(String email, String name);
	
}

//
//Essa interface do JPA ja nos disponibiliza o CRUD.
//
//C
//R
//U
//D
//
//Ou seja métodos para inserir o registro no banco.
//Método para atualizar os registros do banco.
//Método para deletar o registro do  banco.
//Método para listar todos os registros.
//Buscar um registro baseado na chave primária.
//Deletar todos os registros.
//Para buscar paginado, ordenado.

//
//Diferença entre DAO e repositório.
//
//DAO
//O DAO nós temos que construir toda a estrutura básica dele.
//	Temos que construir todos os básics DAOS.
//	Precisamos escrever query string  para todos os casos.
//	
//Repositório.
//	Já temos o DAO basic pronto.
//	Não precisamos de query string para todos os casos.


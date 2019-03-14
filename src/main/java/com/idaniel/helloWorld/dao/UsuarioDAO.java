package com.idaniel.helloWorld.dao;

import org.springframework.data.repository.CrudRepository;

import com.idaniel.helloWorld.entity.Usuario;


public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	
	
	//CrudRepository es una interface de SpringBoot

}

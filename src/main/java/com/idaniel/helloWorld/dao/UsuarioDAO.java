package com.idaniel.helloWorld.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.idaniel.helloWorld.entity.Usuario;


public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	
	
	public List<Usuario> findByNombre(String nombre);
	
	
	//CrudRepository es una interface de SpringBoot

}

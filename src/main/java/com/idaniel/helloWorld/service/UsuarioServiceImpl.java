package com.idaniel.helloWorld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idaniel.helloWorld.dao.UsuarioDAO;
import com.idaniel.helloWorld.entity.Usuario;

public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioDAO dao;

	@Override
	public List<Usuario> obtenerUsuarios() {
		return (List<Usuario>)dao.findAll();
	}

	@Override
	public void guardarUsuario(Usuario usuario) {
		dao.save(usuario);
	}

	@Override
	public Usuario obtenerUsuario(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public void borrarUsuario(Integer id) {
		dao.deleteById(id);	
	}

	@Override
	public List<Usuario> obtenerUsuarioPorNombre(String nombre) {
		return dao.findByNombre(nombre);
	}

}

package com.idaniel.helloWorld.service;

import java.util.List;

import com.idaniel.helloWorld.entity.Usuario;

public interface UsuarioService {
	
	public List<Usuario> obtenerUsuarios();

	public void guardarUsuario(Usuario usuario);

	public Usuario obtenerUsuario(Integer id);

	public void borrarUsuario(Integer id);
	

}

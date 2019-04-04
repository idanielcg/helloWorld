package com.idaniel.helloWorld.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idaniel.helloWorld.entity.Usuario;
import com.idaniel.helloWorld.service.UsuarioService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping(value="/api")
public class UsuarioRestController {

	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value="/usuarios")
	public List<Usuario> obtenerTodosLosUsuarios(){
		
		return usuarioService.obtenerUsuarios();
	}
	
	
	@GetMapping(value="/usuarios/{id}")
	public Usuario obtenerUsuarioPorNombre(@PathVariable int id){
		
		return usuarioService.obtenerUsuario(id);
	}
	
	
}

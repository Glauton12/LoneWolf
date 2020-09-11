package com.TCC.HealthAndCare.repositorio;

import org.springframework.data.repository.Repository;

import com.TCC.HealthAndCare.modelo.UsuarioModelo;

public interface UsuarioRepositorio extends Repository<UsuarioModelo, Integer> {
	
	//Retornar objeto usuario atraves do nome e senha
	UsuarioModelo findByNomeAndSenha(String nome, String senha);
	

}

package com.exemplo01.usuarios.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.exemplo01.usuarios.modelo.UsuarioModelo;

public interface UsuarioRepositorio extends Repository<UsuarioModelo, Integer> {
	
	//Cadastrar
	void save(UsuarioModelo usuario);
	
	//Selecionar
	List<UsuarioModelo> findAll();
	
	//Selecionar usuario especifico
	UsuarioModelo findByCodigo(Integer codigo);
	
	//Excluir
	void delete(UsuarioModelo usuario);

}

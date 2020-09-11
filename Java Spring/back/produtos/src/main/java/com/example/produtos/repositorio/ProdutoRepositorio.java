package com.example.produtos.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.produtos.modelo.ProdutoModelo;

public interface ProdutoRepositorio extends Repository<ProdutoModelo, Integer>{
	
	//Cadastrar
	void save(ProdutoModelo produto);
	
	//Selecionar
	List<ProdutoModelo> findAll();
	
	//Selecionar produto especifico
	ProdutoModelo findByCodigo(Integer codigo);
	
	//Excluir
	void delete(ProdutoModelo produto);

}

package com.TCC.HealthAndCare.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.TCC.HealthAndCare.modelo.PacientesModelo;

public interface PacientesRepositorio extends Repository<PacientesModelo, Integer>{
	
	//Cadastrar
	void save(PacientesModelo paciente);
	
	//Selecionar
	List<PacientesModelo> findAll();
	
	//Selecionar paciente especifico
	PacientesModelo findByCodigo(Integer codigo);
	
	//Excluir
	void delete(PacientesModelo paciente);

}

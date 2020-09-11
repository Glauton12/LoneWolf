package com.TCC.HealthAndCare.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.TCC.HealthAndCare.modelo.PacientesModelo;
import com.TCC.HealthAndCare.modelo.RespostaModelo;
import com.TCC.HealthAndCare.repositorio.PacientesRepositorio;

@CrossOrigin
@RestController
@RequestMapping("/paciente")
public class PacientesControle {
	
	//Obter acesso as ações
	@Autowired
	private PacientesRepositorio acoes;
	
	//Selecionar todos os registros
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<PacientesModelo> listar(){
		return acoes.findAll();	
}
	
	//cadastrar paciente
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody RespostaModelo cadastrar(@RequestBody PacientesModelo paciente) {
		try {
			acoes.save(paciente);
			return new RespostaModelo("Cadastro efetuado com sucesso");
		}catch (Exception erro) {
			return new RespostaModelo("Falha ao cadastrar: "+erro.getMessage());
		}
	}
	
	//Selecionar paciente especifico
	@RequestMapping(value ="/{registro}", method = RequestMethod.GET)
	public @ResponseBody PacientesModelo buscar(@PathVariable("registro")Integer cod) {
		return acoes.findByCodigo(cod);
	}
	
	//Alterar dados
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody RespostaModelo alterar(@RequestBody PacientesModelo paciente) {
		try {
			acoes.save(paciente);
			return new RespostaModelo("Alterado com sucesso");
		}catch(Exception erro) {
			return new RespostaModelo("Falha ao alterar: "+erro.getMessage());
		}
	}
	
	//Exclusão
	@RequestMapping(value="/{registro}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("registro")Integer cod) {
		try {
			PacientesModelo paciente = acoes.findByCodigo(cod);
			
			acoes.delete(paciente);
			return new RespostaModelo("Exclusão efetuada com sucesso!");
		}catch (Exception erro) {
			return new RespostaModelo("Falha ao excluir: "+erro.getMessage());
		}
	}

}

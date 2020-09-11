package com.exemplo01.usuarios.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo01.usuarios.modelo.RespostaModelo;
import com.exemplo01.usuarios.modelo.UsuarioModelo;
import com.exemplo01.usuarios.repositorio.UsuarioRepositorio;

@CrossOrigin
@RestController
@RequestMapping("/usuario")

public class UsuarioControle {
	
	//Obter acesso as ações
	@Autowired
	private UsuarioRepositorio acoes;
	
	
	//selecionar todos os registros
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<UsuarioModelo> listar(){
		return acoes.findAll();
	}
	
	//Cadastrar Usuario
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody RespostaModelo cadastrar(@RequestBody UsuarioModelo usuario) {
		try {
			acoes.save(usuario);
			return new RespostaModelo("Cadastro efetuado com sucesso");
		}catch(Exception erro) {
			return new RespostaModelo("Falha ao cadastrar: "+erro.getMessage());
		}
	}
	
	//Selecionar usuario especifico
	@RequestMapping(value="/{codigo}", method = RequestMethod.GET)
	public  @ResponseBody UsuarioModelo buscar(@PathVariable("codigo") Integer cod) {
		return acoes.findByCodigo(cod);
		
	}
	
	//Alterar dados 
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody RespostaModelo alterar(@RequestBody UsuarioModelo usuario) {
		try {
			acoes.save(usuario);
			return new RespostaModelo("Alterado com sucesso");
		}catch(Exception erro) {
			return new RespostaModelo("Falha ao alterar: "+erro.getMessage());
		}
	}
	
	//Exclusão
	@RequestMapping(value="/{codigo}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("codigo")Integer cod) {
		try {
			UsuarioModelo usuario = acoes.findByCodigo(cod);
			
			acoes.delete(usuario);
			return new RespostaModelo("Exclusão efetuada com sucesso!");
		}catch(Exception erro) {
			return new RespostaModelo("Falha ao excluir: "+erro.getMessage());
		}
	}

}

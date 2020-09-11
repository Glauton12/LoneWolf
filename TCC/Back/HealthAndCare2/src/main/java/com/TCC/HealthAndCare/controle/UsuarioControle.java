package com.TCC.HealthAndCare.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.TCC.HealthAndCare.modelo.UsuarioModelo;
import com.TCC.HealthAndCare.repositorio.UsuarioRepositorio;

@RestController
@CrossOrigin
@RequestMapping("/paciente")
public class UsuarioControle {
	
	//Repositorio
	@Autowired
	private UsuarioRepositorio acao;
	
	//inicio
	@RequestMapping(value="/usuarios", method = RequestMethod.GET)
	public @ResponseBody String Inicio() {
		return "Seja Bem Vindo A Autenticação De Usuario";
	}
	
	
	//Validar login
	@RequestMapping(value="/usuarios/{nome}/{senha}", method = RequestMethod.GET)
	public @ResponseBody UsuarioModelo buscar(@PathVariable("nome") String nome, @PathVariable("senha") String senha) {
		return acao.findByNomeAndSenha(nome, senha);
	}

}

package com.example.produtos.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.produtos.modelo.ProdutoModelo;
import com.example.produtos.modelo.RespostaModelo;
import com.example.produtos.repositorio.ProdutoRepositorio;

@CrossOrigin
@RestController
@RequestMapping("/produto")
public class ProdutosControle {
	
	//Obter acesso as ações
	@Autowired
	private ProdutoRepositorio acoes;
	
	//Selecionar todos os registros
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<ProdutoModelo> listar(){
		return acoes.findAll();
	}
	
	//Cadastrar produto
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody RespostaModelo cadastrar(@RequestBody ProdutoModelo produto) {
		try {
			acoes.save(produto);
			return new RespostaModelo("Cadastro efetuado com sucesso");
		}catch(Exception erro) {
			return new RespostaModelo("Falha ao cadastrar: "+erro.getMessage());
		}
	}
	
	//Selecionar usuario especifico
	@RequestMapping(value="/{codigo}", method = RequestMethod.GET)
	public @ResponseBody ProdutoModelo buscar(@PathVariable("codigo")Integer cod) {
		return acoes.findByCodigo(cod);
	}
	
	//Alterar dados
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody RespostaModelo alterar(@RequestBody ProdutoModelo produto) {
		try {
			acoes.save(produto);
			return new RespostaModelo("Alterado com sucesso");
		}catch(Exception erro) {
			return new RespostaModelo("Falha ao alterar: "+erro.getMessage());
		}
	}
	
	//Exclusão
	@RequestMapping(value="/{codigo}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("codigo")Integer cod) {
		try {
			ProdutoModelo produto = acoes.findByCodigo(cod);
			
			acoes.delete(produto);
			return new RespostaModelo("Exclusão efetuada com sucesso!");
		}catch(Exception erro) {
			return new RespostaModelo("Falha ao excluir: "+erro.getMessage());
		}
	}
	

}

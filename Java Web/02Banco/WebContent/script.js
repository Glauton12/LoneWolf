function valida(){
	
	// Obter a mensagem e os dados do formulário
	var mensagem = document.getElementById("mensagem")
	var nome = document.getElementById("nome").value
	var idade = document.getElementById("idade").value
	var cidade = document.getElementById("cidade").value
	
	// Valida
	var valida = true;
	
	// Validar dados
	if(nome == ""){
		mensagem.style.display = "block"
		mensagem.innerText = "Favor preencher o campo nome"
		valida = false
	}else if(nome.length < 3){
		mensagem.style.display = "block"
		mensagem.innerText = "Favor informar um nome válido"
		valida = false
	}else if(idade == ""){
		mensagem.style.display = "block"
		mensagem.innerText = "Favor preencher o campo idade"
		valida = false
	}else if(isNaN(idade) == true){
		mensagem.style.display = "block"
		mensagem.innerText = "Favor informar uma idade válida"
		valida = false
	}else if(cidade == "Cidade"){
		mensagem.style.display = "block"
		mensagem.innerText = "Favor selecionar uma cidade"
		valida = false
	}
	
	// Retorno
	return valida

}
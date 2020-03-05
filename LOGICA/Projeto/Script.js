// vetor
let vetor = []

// ao carregar o documento
window.onload = () =>{
    verificarArmazenamentoLocal()
    selecionar()
}

// cadastrar
cadastrar = () => {

    // obter dados
    let produto = document.getElementById("produto").value
    let marca = document.getElementById("marca").value
    let valor = document.getElementById("valor").value
   
    // verificar a inserção
    valida(produto, marca, valor)

}

// limpar campos
limpar = () => {

    document.getElementById("produto").value =""
    document.getElementById("marca").value ="Marca"
    document.getElementById("valor").value =""

}


// mensagem
mensagem = (mensagem, tipo) => {

    // obter um elemento alerta
    let alerta = document.getElementById("alerta")

    // removendo todas as classes ativas
    alerta.removeAttribute("class")

    // exixbindo a mensagem
    alerta.innerText = mensagem

    // adicionando a classe alert
    alerta.classList.add("alert")

    // tipo da mensagem
    if(tipo == "ok"){
        alerta.classList.add("alert-success")
    
    }else if(tipo == "cancelar"){
        alerta.classList.add("alert-warning")
    
    }else{
        alerta.classList.add("alert-danger")
    }

}

// validar campos
valida = (produto, marca, valor) =>{
    
    // condicional
    if(produto == ""){
        mensagem("Favor preencher o nome do produto", "falha")
    }else if(produtoDuplicado(produto)){
        mensagem("esse produto já está cadastrado", "falha")
    }else if(marca == "Marca"){
        mensagem("Favor selecionar uma marca", "falha")
    }else if(valor==""){
        mensagem("Favor preencher o valor do produto","falha")
    }else{
        vetor.push({produto:produto, marca:marca, valor:valor})
        mensagem("Produto cadastrado com sucesso!", "ok")
        armazenarDadosLocal()
        limpar ()
        selecionar()
    }
}

// selecionar
selecionar = () =>{
    // obter a tabela 
    let tabela = document.getElementById("tabela")
    // limpar tabela
    tabela.innerHTML = ""

    // laço
    for(let indice=0; indice<vetor.length; indice++){
    
    
        // criar linha
        let linha = tabela.insertRow(-1)

        // criar colunas
        let colunaCodigo = linha.insertCell(0)
        let colunaProduto = linha.insertCell(1)
        let colunaMarca = linha.insertCell(2)
        let colunaValor = linha.insertCell(3)
        let colunaRemover = linha.insertCell(4)

        // valores das células
        colunaCodigo.innerHTML = indice+1
        colunaProduto.innerHTML = vetor[indice].produto
        colunaMarca.innerHTML = vetor[indice].marca
        colunaValor.innerHTML = vetor[indice].valor
        colunaRemover.innerHTML = "<button class='btn btn-danger' onClick='remover("+indice+")'>Remover</button>"

        
    }
}

// remover
remover = (indice) =>{
    // validar
    let valida = confirm("deseja realmente excluir o produto:"+vetor[indice].produto+"?")

    // condicional
    if(valida == true){
        vetor.splice(indice, 1)
        armazenarDadosLocal()
        mensagem("Produto removido com sucesso!", "ok")
        selecionar()
    }else{
        mensagem("Produto não removido", "cancelar")
    }
}

// armazenar no local storage
armazenarDadosLocal = () => {

// remover produtos armazenados
localStorage.removeItem("produtos")

// adicionar o vetor de produtos
localStorage.setItem("produtos", JSON.stringify(vetor))

}

// verificar localStorage
verificarArmazenamentoLocal = () => {
    // adicionar os dados do localStorage no vetor
    if(localStorage.getItem("produtos") != null){
    vetor = JSON.parse(localStorage.getItem("produtos"))
    }
}

// verificar o nome do produto (duplicado)
produtoDuplicado = (nome) =>{

    // Variavel
    let existe = false

    // laço
    for (let indice = 0; indice<vetor.length; indice++){
        if(nome.toLowerCase() == vetor[indice].produto.toLowerCase()){
            existe = true
            break
        }
    }

    // retorno
    return existe

}
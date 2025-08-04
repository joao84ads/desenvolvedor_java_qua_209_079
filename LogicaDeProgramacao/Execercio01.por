programa {
  funcao inicio() {
    //declaração de variavel
    cadeia nome, genero
    inteiro idade

    //entrada de dados
    escreva("Escreva seu nome: ")
    leia(nome)
    escreva("Escreva sua idade: ")
    leia(idade)
    escreva("Escreva seu genero: ")
    leia(genero)

    //verificação

    se (idade >= 65 e genero == "masculino") {
      escreva("Você esta apto para aposentadoria")
      se (idade >= 63 e genero == "feminino") escreva ("Você esta apto para aposentadoria")
    }
    senao {
      escreva("Você não esta apto para aposentadoria")

    }
  }
}

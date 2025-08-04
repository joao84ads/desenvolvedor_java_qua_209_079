programa {
  funcao inicio() {
    //declaração de variaveis
    cadeia nome
    inteiro idade
    
    //entrada de dados
    escreva("infome seu nome: ")
    leia(nome)
    escreva("informe sua idade: ")
    leia(idade)

    //estrutura de desição
    se (idade >= 18)
    {
      escreva(nome, " é maior de idade.")
    }
    senao
    {
      escreva(nome, " é menor de idade.")
    }
  }
}

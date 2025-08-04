programa {
  funcao inicio() {
    // Declaração de variaveis
    real x, y, result
    inteiro opcao

    // Loop faça enquanto
    faca{
      // menu
      escreva("\n1 - Soma\n")
      escreva("2 - Subtração\n")
      escreva("3 - Multiplicação\n")
      escreva("4 - Divisão\n")
      escreva("5 - Sair\n")
      leia(opcao)

      // verificar se o usuario deseja sair ou nao
      se  (opcao >= 1 e opcao <= 4){
        escreva("informe o calor de x: ")
        leia(x)
        escreva("informe o calor de y: ")
        leia(y)
      }

      // verifica a opção escolhida
      escolha (opcao){
        caso 1:
          result = x+y
          escreva("Resultado: ", result)
          pare

        caso 2:
          result = x-y
          escreva("resultado: ", result)
          pare

        caso 3:
          result = x*y
          escreva("resultado: ", result)
          pare

        caso 4:
          result = x/y
          escreva("resultado: ", result)
          pare

        caso 5:
          escreva("programa encerrado. ")
          pare
        caso contrario:
          escreva("opção invalidade. ")
      }
    } enquanto (opcao != 5)
  }
}

programa {
  funcao inicio() {
    // declaração de variaveis
    inteiro opcao 
    real x, y, result

    // entrada de dados
    escreva("informe o valor de x: ")
    leia(x)
    escreva("informe o valor de y: ")
    leia(y)
    escreva("1 - Soma.\n")
    escreva("2 - Subtraçãp.\n")
    escreva("3 - Multiplicação.\n")
    escreva("4 - Divisão\n")
    escreva("informe a opção desejada:\n")
    leia(opcao)

    // escola caso
    escolha (opcao)
    {
      caso 1:
        result = x+y
        escreva("O resultado é ", result)
        pare
      caso 2:
        result = x-y
        escreva("O resultado é ", result)
        pare
      caso 3:
        result = x*y
        escreva("O resultado é ", result)
        pare
      caso 4:
        result = x/y
        escreva("O resultado é", result)
        pare
      caso contrario:
        escreva("opção inválida")
    }

  }
}

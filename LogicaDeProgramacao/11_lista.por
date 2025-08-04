programa {
  funcao inicio() {
    //declaração de vetor
    cadeia nomes[10]
    inteiro idades[10]
    
    //entrada de dados
    para(inteiro i = 0; i < 10; i++){
      escreva("informe o", i+1, " nome do usario:")
      leia(nomes[i])
      escreva("informe o", i+1, " idade do usario:")
      leia(idades[i])
    }
    // saida de dados
    para(inteiro i = 0; i < 10; i++){
      escreva("O nome do", i+1, "usuario", nomes[i], "\n")
      escreva("idade:", idade[i], "\n")
    }
  }
}

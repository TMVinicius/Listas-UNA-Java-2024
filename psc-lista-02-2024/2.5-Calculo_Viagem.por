programa {
  funcao inicio() {

    real preco1, preco2, preco3, total
    inteiro pessoas1, pessoas2, pessoas3

    escreva("Preço da primeira viagem: ")
    leia(preco1)
    escreva("Numero de pessoas na primeira viagem: ")
    leia(pessoas1)

    escreva("Preço da segunda viagem: ")
    leia(preco2)
    escreva("Numero de pessoas na segunda viagem: ")
    leia(pessoas2)

    escreva("Preço da terceira viagem: ")
    leia(preco3)
    escreva("Numero de pessoas na terceira viagem: ")
    leia(pessoas3)




    total = (preco1*pessoas1) + (preco2*pessoas2) + (preco3*pessoas3)

    escreva("Total da viagem:", total)


  }
}

def maiorPalavraLista(lista):
    maior = ''
    maiorQtd = len(maior)

    for palavra in lista:
        tamanhoPalavra = len(palavra)
        if tamanhoPalavra > maiorQtd:
            maior = palavra
            maiorQtd = len(maior)

    return maior       

lista = ['maçã', 'banana', 'uva']

print(maiorPalavraLista(lista))


preco = float(input("Informe o preço pago: "))

if(preco > 0 and preco < 100):
    taxaDeJuros = preco * 0.10
    preco = preco + taxaDeJuros
    print("Com os juros aplicados, o valor final é: ",preco)
elif(preco > 100 and preco <= 300):
    taxaDeJuros = preco * 0.20
    preco = preco + taxaDeJuros
    print("Com os juros aplicados, o valor final é: ",preco)
elif(preco >= 300 and preco < 1000):
    taxaDeJuros = preco * 0.5
    preco = preco + taxaDeJuros
    print("Com os juros aplicados, o valor final é: ",preco)
else:
    print("Erro.")

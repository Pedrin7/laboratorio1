def soma(val):
    soma = 0
    if val < 0:
        return -1
    else: 
        for i in range(0, val + 1):
            soma += i
        return soma

somaValores = soma(10)
print(somaValores)
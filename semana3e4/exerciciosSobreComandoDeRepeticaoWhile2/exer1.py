# Declaração de variáveis
cont = 1

while cont <= 10:
    print(cont,'º vez')
    num = float(input("Informe um número aleatório: "))
    if num < 0:
        print("Número negativo:",num)
    elif num == 0:
        print("Número 0 informado.")
    else:
        print("Número positivo informado:",num)
    cont += 1


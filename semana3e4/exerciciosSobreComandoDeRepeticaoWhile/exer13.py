# declaração de variáveis
num = int(input("Informe um número para descobrir seu fatorial: "))
i = num - 1
fat = 1

if(num < 0):
    print("Numero inválido!")
else:
    # while para descobrir o fatorial
    while(i >= 1):
        fat = num * i
        i -= 1
        num = fat

print('Fatorial do número informado é:',fat)
     

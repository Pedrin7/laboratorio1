# Declaração daa variaveis
cont = 0
num = 0
somaNums = 0

# Orientação para o usuário
print("Informe números positivos")

# Loop para continuar pedindo ao usuario que informe um numero positivo
while(num >= 0):
    num = float(input("Informe um número: "))
    # if para verificar se o usuario digitou um numero positivo
    if(num >= 0):       
        somaNums = num + somaNums
        cont += 1
    else:
        print("Número negativo informado")

# Descobrindo a média dos numeros digitados
media = somaNums / cont

print('A média dos números digitados é:',media)

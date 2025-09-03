# Declaração de variaveis
inter1 = int(input("Informe o primeiro número: "))
inter2 = int(input("Informe o segundo número: "))
somaPares = 0
somaImpares = 0

# Descobre quem é o maior e quem é o menor
maior = inter2
menor = inter1

# Verifica se o primeiro numero digitado é maior que o segundo
# caso for, altera quem é o maior e quem é o menor
if(inter1 > inter2):
    maior = inter1
    menor = inter2

# Estrutura para somar os numeros pares e os numeros impares no intervalo
while(menor <= maior):
    if(menor % 2 == 0):
        somaPares = menor + somaPares
    if(menor % 2 != 0):
        somaImpares = menor + somaImpares
    menor += 1

print("A soma dos números pares no intervalo é:",somaPares)
print("A soma dos números impares no intervalo é:",somaImpares)


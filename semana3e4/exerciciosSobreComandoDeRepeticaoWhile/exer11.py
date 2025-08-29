inter1 = int(input("Informe o primeiro número: "))
inter2 = int(input("Informe o segundo número: "))
somaPares = 0
somaImpares = 0

while(inter1 > inter2 or inter1 < inter2):
    if(inter1 > inter2):
        if(inter1 % 2 == 0):
            somaPares = somaPares + inter1
        elif(inter1 % 2 == 1):
            somaImpares = somaImpares + inter1
        inter1 -= 1
    if(inter1 < inter2):
        if(inter2 % 2 == 0):
            somaPares = somaPares + inter2
        elif(inter2 % 2 == 1):
            somaImpares = somaImpares + inter2
        inter2 -= 1

print("A soma dos números pares é: ",somaPares)
print("A soma dos números impares é: ",somaImpares)

# arrumar, está com problemas

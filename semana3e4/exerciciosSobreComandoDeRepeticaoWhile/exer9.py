val1 = int(input("Informe um valor: ")) 
val2 = int(input("Informe outro valor: "))


if(val1 >= 0 and val2 >= 0):
    while(val1 >= val2):
        if(val1 % 2 == 0):
            print(val1)
        val1 -= 1
    while(val2 >= val1):
        if(val2 % 2 == 0):
            print(val2)
        val2 -= 1

"""
CORREÇÃO com a solução 100%

val1 = int(input("Informe um valor: ")) 
val2 = int(input("Informe outro valor: "))

if val1 >= 0 and val2 >= 0:
    # Descobre quem é o menor e quem é o maior
    menor = val1
    maior = val2

    if val1 > val2:
        menor = val2
        maior = val1

    # Agora percorre do menor até o maior
    while menor <= maior:
        if menor % 2 == 0:
            print(menor)
        menor += 1
else:
    print("Um dos valores é negativo.")
"""

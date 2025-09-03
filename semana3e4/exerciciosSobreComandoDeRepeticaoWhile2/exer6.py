soma = 0

while True:
    num = float(input("Informe valores positivos e pares: "))

    if num > 0 and num % 2 == 0:
        soma += num
    else:
        break

print("A soma dos números positivos e pares informados é:",soma)

#solução "avançada" acima

# solução feita abaixo

# num = float(input("Informe valores positivos e pares: ")) 
# soma = 0

# while num > 0 and num % 2 == 0: 
#     soma = num + soma 
#     snum = float(input("Informe valores positivos e pares: ")) 
    
# print("A soma dos números positivos e pares informados é:",soma)

def maiorValor(num1,num2,num3):
    if(num1 > num2 and num1 > num3):
        return num1
    elif(num2 > num1 and num2 > num3):
        return num2
    elif(num3 > num1 and num3 > num1):
        return num3
    else:
        print("Os valores são iguais!")
    
maior = maiorValor(7,2,58)

print("O maior valor é:", maior)


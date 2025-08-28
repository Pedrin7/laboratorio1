num1 = int(input("Informe um valor: "))
num2 = int(input("Informe outro valor: "))
num3 = int(input("Informe o último valor: "))

if(num1 > num2 and num1 > num3):
    print("O maior valor informado é: ",num1)
elif(num2 > num1 and num2 > num3):
    print("O maior valor informado é:", num2)
else:
    print("O maior valor informado é: ",num3)
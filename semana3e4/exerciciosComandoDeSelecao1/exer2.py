num1 = int(input("Informe um valor inteiro: "))
num2 = int(input("Informe outro valor inteiro: "))

if(num1 > num2):
    print("O primeiro número informado é maior que o segundo")
    print(num1)
elif(num1 < num2):
    print("O primeiro número informado é menor que o segundo")
    print(num2)
else:
    print("Os número são iguais")
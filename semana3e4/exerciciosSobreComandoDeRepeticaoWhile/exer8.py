quant = int(input("Informe quantos números irá informar: "))
cont = 0

while(cont < quant):
    num = int(input("Informe um valor inteiro: "))
    if(num > 0):
        print("O número é positivo!")
    elif(num < 0):
        print("O número é negativo!")
    else:
        print("O número informado é igual a 0!")
    cont += 1


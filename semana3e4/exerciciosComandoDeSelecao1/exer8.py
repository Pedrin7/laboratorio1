print("Digite 1 para somar dois valores\nDigite 2 para subtrair dois valores\nDigite 3 para multiplicar dois valores\nDigite 4 para dividir dois valores\nDigite 5 para realizar uma potência entre dois valores\nDigite 6 para realizar uma radiciação entre dois valores")

opcao = int(input("Informe a operação a ser realizada: "))

if(opcao == 1):
    num1 = float(input("Informe o primeiro valor: "))
    num2 = float(input("Informe o segundo valor: "))
    soma = num1 + num2
    print("A soma é:",soma)
elif(opcao == 2):
    num1 = float(input("Informe o primeiro valor: "))
    num2 = float(input("Informe o segundo valor: "))
    sub = num1 - num2
    print("A subtração é:",sub)
elif(opcao == 3):
    num1 = float(input("Informe o primeiro valor: "))
    num2 = float(input("Informe o segundo valor: "))
    multi = num1 * num2
    print("A multiplicação é:",multi)
elif(opcao == 4):
    num1 = float(input("Informe o primeiro valor: "))
    num2 = float(input("Informe o segundo valor: "))
    divi = num1 / num2
    print("A divisão é:",divi)
elif(opcao == 5):
    num1 = float(input("Informe o primeiro valor: "))
    num2 = float(input("Informe o segundo valor: "))
    poten = num1 ** num2
    print("A potenciação do primeiro informado sobre o segundo número informado é:",poten)
elif(opcao == 6):
    num1 = float(input("Informe o primeiro valor: "))
    num2 = float(input("Informe o segundo valor: "))
    radi = num1 ** (1/num2)
    print("A radiciação do primeiro numerdo informado pelo segundo é:",radi)
else:
    print("Opção inválida!")
    


    






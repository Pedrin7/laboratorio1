num1 = int(input("Informe um valor: "))
num2 = int(input("Informe outro valor: "))

num1 += 1

if num1 > num2:
    print("Erro.")
else:
    while num1 < num2:
        print(num1)
        num1 += 1
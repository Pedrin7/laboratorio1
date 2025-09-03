num1 = int(input("Informe um valor: "))
num2 = int(input("Informe outro valor: "))

if num1 > num2:
    num2 += 1
    while num2 < num1:
        print(num2)
        num2 += 1
elif num2 > num1:
    num1 += 1
    while num1 < num2:
        print(num1)
        num1 += 1
else: 
    print("Números possuem o mesmo valor!")


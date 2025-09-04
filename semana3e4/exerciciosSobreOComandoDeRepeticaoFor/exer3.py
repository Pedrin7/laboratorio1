num = int(input("Informe um número e descubra sua tabuada: "))

for i in range(1, 11):
    tab = num * i
    print(num, " x ", i , " = ",tab)
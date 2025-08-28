grauA = float(input("Informe a nota do Grau A: "))
grauB = float(input("Informe a nota do Grau B: "))

grauA = grauA * 0.3
grauB = grauB * 0.7
notaFinal = grauA + grauB 

if(notaFinal < 6):
    print("Será necessário fazer o grau C, sua nota final é:",notaFinal)
else:
    print("Sua nota final é:", notaFinal, "Não será necessário fazer o grau C")
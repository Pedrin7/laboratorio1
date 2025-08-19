trabalho = float(input("Informe a nota do trabalho: "))
prova = float(input("Informe a nota da prova: "))
teste = float(input("Informe a nota do teste: "))

trabalho = trabalho * 0.1
prova = prova * 0.6
teste = teste * 0.3

notaFinal = (trabalho + prova + teste)
print(f"A nota final é: {notaFinal}")

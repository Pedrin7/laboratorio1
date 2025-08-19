print("Notas grau A")
atividadePraticaGa = float(input("Informe a nota da atividade prática do GA: "))
atividadePraticaGa = atividadePraticaGa * 0.45
atividadeTeoricaGa = float(input("Informe a nota da atividade teorica do GA: "))
atividadeTeoricaGa = atividadeTeoricaGa * 0.55

grauA = atividadePraticaGa + atividadeTeoricaGa
grauA = grauA * 0.33
print(grauA)

print("Notas grau B")
provaEmLaboratorio = float(input("Informe a nota da prova em laboratório: "))
provaEmLaboratorio = provaEmLaboratorio * 0.6
testeTeorico = float(input("Informe a nota do teste teorico: "))
testeTeorico = testeTeorico * 0.2
trabalhoExtraclasse = float(input("Informe a nota do trabalho extraclasse: "))
trabalhoExtraclasse = trabalhoExtraclasse * 0.2

grauB = provaEmLaboratorio + testeTeorico + trabalhoExtraclasse
grauB = grauB * 0.67
print(grauB)

notaFinal = grauA + grauB
print("A nota final é: ",notaFinal)



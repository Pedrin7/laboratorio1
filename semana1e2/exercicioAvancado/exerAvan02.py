a = int(input("Informe um valor para a: "))
b = int(input("Informe um valor para b: "))
c = int(input("Informe um valor para c: "))

# Fórmula de BÁSKARA
raizPositiva = ((b * -1) + (b ** 2 - 4 * a * c) ** (1/2)) / (2 * a)
raizNegativa = ((b * -1) - (b ** 2 - 4 * a * c) ** (1/2)) / (2 * a)

print(f"Raiz positiva: {raizPositiva}")
print(f"Raiz positiva: {raizNegativa}")
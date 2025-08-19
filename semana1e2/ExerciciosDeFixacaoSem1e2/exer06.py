a = int(input("Informe o primeiro número: "))
b = int(input("Informe o segundo número: "))
c = int(input("Informe o terceiro número: "))
d = int(input("Informe o quarto número: "))
e = int(input("Informe o quinto número: "))

# B=base e C=altura são abase do triangulo
areaTrinagulo = (b * c) / 2

# A, B, C e D formam um retangulo
perimetroRetangulo = a + b + c + d

# e é o valor do raio de um determinado circulo
areaCirculo = 3.14 * e ** 2

print("Área do triângulo:",areaTrinagulo)
print("Perimetro do retangulo:",perimetroRetangulo)
print("Área do circulo:",areaCirculo)
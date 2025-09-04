texto = str(input("Digite o texto: "))
cont = 0

for i in texto:
    if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u' or i == 'A' or i == 'E' or i == 'I' or i == 'O' or i == 'U':
        cont += 1
print("A quantidade de vogais é:",cont)
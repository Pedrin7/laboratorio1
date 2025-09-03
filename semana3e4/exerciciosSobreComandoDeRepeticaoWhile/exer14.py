# Declaração de variaveis
num = int(input("Informe um número e descubra se é primo: "))
# O I começa em 2 pois, contando com ele, os números antes não são primos
i = 2
# verifica se o numero tem algum divisor, caso sim, divisor = True
divisor = False

# verifica se o numero é menor ou igual a 1(caso for, já indica que o numero não é primo) 
if num <= 1:
    print("O número não é primo")
# Informa o usuário que o numero 2 é primo(caso o usuário digite)
elif num == 2:
    print("O número 2 é primo")
# Informa o usuário que o único número par primo é o 2
elif num % 2 == 0:
    print("O único número primo par é o 2")
# Logica que verifica se o numero é primo
else:
    while(i < num):
        if num % i == 0:
            # caso algum valor do while for divisivel pelo numero informado, quer dizer que o numero nao é primo
            divisor = True
            # quebra o loop
            break
        i += 1 
    # caso nenhum número do while for divisivel pelo numero informado, a var divisor se mantem False, ou seja, o numero é primo
    if divisor == False:
        print("O número é primo.")
    else:
        print("Não é primo.")
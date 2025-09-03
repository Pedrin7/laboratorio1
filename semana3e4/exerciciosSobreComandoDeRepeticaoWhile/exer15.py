# declaração de variáveis
num = 0   # começa no 0
limite = 200
soma = 0

while num <= limite:
    if num < 2:  
        # 0 e 1 não são primos → ignora
        num += 1
        continue
    
    div = 2
    eh_primo = True
    
    # verifica divisores de 2 até a raiz quadrada de num
    while div * div <= num:
        if num % div == 0:
            eh_primo = False
            break
        div += 1
    
    if eh_primo:
        print(num)
        soma += num
    
    num += 1

print("A soma dos números primos entre 0 e 200 é:", soma)

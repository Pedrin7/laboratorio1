def verificaString(val):
    cont = 0
    for i in val:
        if i != " ":
            cont += 1
    return cont
        
verifica = verificaString("O grêmio é o maior do sul!")
print(verifica)
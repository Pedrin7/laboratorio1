cont = 0
contTorcedoresGremio = 0

while(cont < 10):
    time = str(input("Informe o time que você torce: "))
    if(time == 'gremio' or time == 'Gremio' or time == 'Grêmio' or time == 'grêmio'):
        contTorcedoresGremio += 1
    cont += 1

print("O total de torcedors gremistas é: ",contTorcedoresGremio)

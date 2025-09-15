def media(n1, n2, n3):
    mediaNotas = (n1 + n2 + n3) / 3
    if n1 < 0 or n2 < 0 or n3 < 0:
        print("Erro")
    else:
        if(mediaNotas > 0 and mediaNotas <= 4):
            print('conceito D')
        elif(mediaNotas > 4 and mediaNotas <= 7):
            print('conceito C')
        elif(mediaNotas > 7 and mediaNotas <= 9):
            print('conceito B')
        elif(mediaNotas > 9 and mediaNotas <= 10):
            print('conceito A')

media(10, -10, 10)    
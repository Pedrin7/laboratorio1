user = str(input("Informe o usuário: "))
password = str(input("Informe a senha: "))
tentativa = 1

while tentativa < 3:
    if user != 'USER10' or password != 'PASSWORD1234':
        print("Usuário ou senha incorretos, tente novamente!")
        user = str(input("Informe o usuário: "))
        password = str(input("Informe a senha: "))
        tentativa += 1
    else:
        print('Login efetuado com sucesso!')
        break
if tentativa == 3:
    print("Número máximo de tentativas excedido!")


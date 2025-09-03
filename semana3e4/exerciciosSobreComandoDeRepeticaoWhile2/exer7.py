user = str(input("Informe o usuário: "))
password = str(input("Informe a senha: "))

while user != 'USER10' or password != 'PASSWORD1234':
    print("Usuário ou senha incorretos, tente novamente!")

    user = str(input("Informe o usuário: "))
    password = str(input("Informe a senha: "))

if user == 'USER10' and password == 'PASSWORD1234':
    print('Login efetuado com sucesso!')


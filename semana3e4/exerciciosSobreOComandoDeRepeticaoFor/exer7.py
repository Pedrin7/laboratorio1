print("Vamos definir sua senha!")
cont = 0

while cont < 6:
    senha = str(input("Informe a senha: "))
    tamanhoSenha = len(senha)
    if tamanhoSenha < 5 or tamanhoSenha > 10:
        print("Tamanho de senha inválido. Tem que ter entre 5 e 10 caracteres")
    else:
        for i in senha:
            if i == ' ':
                print("Não pode ter espaço na senha!")
                break 
        else:
            print("Senha definida com sucesso!")
            break
    cont += 1
if cont == 6:
    print("Burro demais, máximo de tentativas excedidas!")
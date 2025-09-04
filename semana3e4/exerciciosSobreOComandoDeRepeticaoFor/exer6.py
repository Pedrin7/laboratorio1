nomeSolteiros = ''
nomeCasados = ''
nomeDivorciados = ''
nomeViuvos = ''

for i in range(0, 6):
    nome = str(input("Informe seu nome: "))
    estadoCivil = str(input("Informe seu estado civil: "))

    if estadoCivil == 'solteiro' or estadoCivil == 'solteira' or estadoCivil == 'Solteiro' or estadoCivil == 'Solteira' and nome != '':
        nomeSolteiros += nome + ', '
    elif estadoCivil == 'casado' or estadoCivil == 'casada' or estadoCivil == 'Casado' or estadoCivil == 'Casada' and nome != '':
        nomeCasados += nome + ', '
    elif estadoCivil == 'divorciado' or estadoCivil == 'divorciada' or estadoCivil == 'Divorciado' or estadoCivil == 'Divorciada' and nome != '':
        nomeDivorciados += nome + ', '
    elif estadoCivil == 'viuvo' or estadoCivil == 'viuva' or estadoCivil == 'Viuvo' or estadoCivil == 'Viuva' and nome != '':
        nomeViuvos += nome + ', '
    else:
        print("Estado civil inválido!")

# rstrip remove o espaço e a vírgula no final
nomeSolteiros = nomeSolteiros.rstrip(', ')
nomeCasados = nomeCasados.rstrip(', ')
nomeDivorciados = nomeDivorciados.rstrip(', ')
nomeViuvos = nomeViuvos.rstrip(', ')

print('Solteiros:',nomeSolteiros,'\n'+'Casados:',nomeCasados,'\n'+'Divorciados:',nomeDivorciados,'\n'+'Viuvos:',nomeViuvos)
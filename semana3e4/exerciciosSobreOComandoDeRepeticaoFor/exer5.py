num = int(input("Quantos produtos irá comprar? "))
listaCompras = ''

for i in range(0, num):
    produtos = str(input("Informe o produto: "))
    listaCompras += produtos + ', '
      
listaCompras = listaCompras.rstrip(', ')

print("Lista de compras",listaCompras.strip(','))
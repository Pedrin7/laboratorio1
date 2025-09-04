joio = ''
trigo = ''

joioETrigo  =  ["joio",  "trigo",  "trigo",  "joio",  "trigo", 
"joio",  "joio",  "joio",  "joio",  "trigo",  "trigo",  "joio", 
"joio", "joio", "trigo", "trigo", "trigo", "trigo", "trigo", 
"trigo",  "trigo",  "trigo",  "trigo",  "trigo",  "trigo", 
"joio",  "joio",  "joio",  "joio",  "joio",  "joio",  "joio", 
"joio",  "trigo",  "trigo",  "joio",  "joio",  "joio",  "joio", 
"joio",  "joio",  "joio",  "joio",  "joio",  "joio",  "joio", 
"joio",  "joio",  "joio",  "joio",  "joio",  "trigo",  "trigo", 
"trigo",  "trigo",  "trigo",  "trigo",  "trigo",  "trigo", 
"trigo",  "trigo",  "trigo",  "trigo",  "trigo",  "trigo", 
"trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio", 
"joio",  "joio",  "joio",  "joio",  "joio",  "joio",  "joio", 
"trigo",  "trigo",  "trigo",  "trigo",  "trigo",  "trigo", 
"trigo", "trigo", "trigo", "joio", "joio", "joio", "joio", 
"joio",  "joio",  "trigo",  "joio",  "joio",  "joio",  "joio", 
"joio", "trigo", "trigo", "trigo", "trigo", "joio", "joio", 
"joio",  "joio",  "joio",  "joio",  "joio",  "trigo",  "trigo", 
"trigo", "joio", "trigo", "joio", "joio", "joio"]

for i in joioETrigo:
    if i == "joio":
        joio += i + ', '
    elif i == "trigo":
        trigo += 'trigo' + ', '

joio = joio.rstrip(', ')
trigo = trigo.rstrip(', ')

print("Joio:",joio)
print('-----------------------------------------------------------------------------')
print("Trigo:",trigo)
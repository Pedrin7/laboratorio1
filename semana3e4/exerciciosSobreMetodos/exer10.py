import math

def ehPrimo(num): 
    if num < 0:
        return False
    else:
        raizNum = int(math.sqrt(num)) + 1
        for i in range(2, raizNum):
            if num % i == 0:
                return False
        return True
                
primo = print(ehPrimo(24))
                

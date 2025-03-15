import random 

def numero_aleatorio(): 
    numero = random.randint(1, 10) 
    n = int(input("Digíte un numero: ")) 
    while n != numero: 
        print("Fallaste, intenta de nuevo") 
        n = int(input("Digíte un numero: ")) 
    print("Adivinaste el numero aleatorio!!!") 


numero_aleatorio()
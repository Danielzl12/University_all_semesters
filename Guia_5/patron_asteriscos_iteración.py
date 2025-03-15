def patron(): 
    n = int(input("Digíte un numero: ")) 
    for i in range(n): 
        # Se itera desde 0, por eso se pone el +1 para que la primera línea tenga 1 asterisco
        print("*"*(i+1)) 
patron()
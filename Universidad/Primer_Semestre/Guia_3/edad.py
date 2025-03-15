def miEdad():
    edad = int(input("Digíte la edad del usuario: "))
    if edad <= 17:
        print("El usuario es menor de edad")
    elif 18 <= edad < 30:
        print("El usuario es mayor de edad")
    elif 31 <= edad < 40:
        print("El usuario es adulto")
    else:
        print("El usuario es adulto mayor")
        
miEdad()

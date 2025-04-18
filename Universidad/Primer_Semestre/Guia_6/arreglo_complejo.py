def array_complejo():
    usuario = []  # Inicializar la lista vacía correctamente
    n = int(input("Ingrese la cantidad de números que desea ingresar: "))  # Solicitar al usuario la cantidad de números
    for i in range(n):  # Iterar n veces
        numero = int(input("Ingrese un número: "))
        usuario.append(numero)  # Agregar el número a la lista

    objetivo = int(input("Ingrese el número objetivo: "))  # Solicitar el número objetivo

    if objetivo in usuario:  # Verificar si el número objetivo está en la lista
        print(f"El número {objetivo} está presente en el arreglo.")
    else:
        print(f"El número {objetivo} no está presente en el arreglo.")
        
array_complejo()
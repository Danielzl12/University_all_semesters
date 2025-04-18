def array_simple():
    n = int(input("Ingrese la cantidad de números que desea generar: "))  # Solicitar al usuario la cantidad de números
    usuario = list(range(1, n + 1))  # Generar el arreglo automáticamente de 1 a n
    print(f"El arreglo generado es: {usuario}")

    objetivo = int(input("Ingrese el número objetivo: "))  # Solicitar el número objetivo

    if objetivo in usuario:  # Verificar si el número objetivo está en la lista
        print(f"El número {objetivo} está presente en el arreglo.")
    else:
        print(f"El número {objetivo} no está presente en el arreglo.")
        
array_simple()
def tablas():
    # Inicializa una cadena vacía para almacenar la salida
    Salida = ""
    # Solicita al usuario que ingrese un número entero positivo
    N1 = int(input("Digíte entero positivo: "))
    # Itera desde 1 hasta el que se defina (en este caso 10)
    for i in range(1, 11, 1):
        # Construye la cadena de salida con la multiplicación actual
        Salida = Salida + str(i) + " * " + str(N1) + "= " + str(i * N1) + "\n"
    # Imprime la cadena de salida completa
    print(f"{Salida}")
# Llama a la función Trabajo3 para ejecutar el código
tablas()
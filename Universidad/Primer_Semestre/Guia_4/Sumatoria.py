def sumatoria():
    # Inicializa la variable Suma en 0
    Suma = 0
    # Inicializa la variable N1 como una cadena vacía para entrar en el bucle
    N1 = ""
    # Imprime un mensaje indicando cómo salir del bucle
    print("Digíte 'salir' para terminar")
    # Bucle que se ejecuta mientras N1 no sea igual a 'salir'
    while N1.lower() != "salir":  # .lower() convierte la entrada a minúsculas para comparación insensible a mayúsculas
        # Solicita al usuario que ingrese un número entero positivo o 'salir' para terminar
        N1 = input("Digíte entero positivo o 'salir' para terminar: ")
        # Verifica si el usuario ingresó 'salir'
        if N1.lower() == "salir":
            break  # break sale del bucle inmediatamente
        # Convierte la entrada a entero y suma el valor ingresado a la variable Suma
        try:
            Suma = Suma + int(N1)
        except ValueError:
            # Maneja el caso en que la entrada no puede ser convertida a entero
            print("Por favor, ingrese un número entero válido o 'salir' para terminar.")
    # Imprime la sumatoria total de los números ingresados
    print(f"Sumatoria de todos los números = {Suma}")

# Llama a la función Punto2 para ejecutar el código
sumatoria()
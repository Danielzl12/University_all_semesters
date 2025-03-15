def dígitos(x):
    # Inicializa el contador de dígitos en 0
    c = 0
    # Bucle que se ejecuta mientras x sea mayor que 0
    while x > 0:
        # Incrementa el contador de dígitos en 1
        c += 1

        # Divide x por 10 usando división entera (descarta la parte decimal)
        x = x // 10
    # Retorna el número total de dígitos
    return c
# Solicita al usuario que ingrese un número entero positivo
n = int(input("Digíte un número entero positivo: "))
# Imprime el número de dígitos en el número ingresado
print(f"El número de dígitos en {n} es: {dígitos(n)}")


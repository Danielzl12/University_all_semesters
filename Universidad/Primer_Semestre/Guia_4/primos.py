def primo(n):
    # Si n es menor que 2, no es primo
    if n < 2:
        return False
    # Bucle que se ejecuta desde 2 hasta la raíz cuadrada de n
    for i in range(2, int(n ** 0.5) + 1):
        # Si n es divisible por i, no es primo
        if n % i == 0:
            return False
    # Si no se encontraron divisores, n es primo
    return True
# Solicita al usuario que ingrese un número entero positivo
Inicio = int(input("Digíte el numero de inicio: "))   
Fin = int(input("Digíte el numero de fin: "))    

print(f"Los números primos entre {Inicio} y {Fin} son:")
# Itera desde Inicio hasta Fin  (Fin + 1 para incluir Fin)
for num in range(Inicio, Fin + 1):
    # Si num es primo, imprime
    if primo(num):
        print(num)

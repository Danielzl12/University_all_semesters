def factorial(n): 
    resultado = 1 
    for i in range(1, n + 1): 
        resultado *= i 
    return resultado 

Inicio = int(input("Digíte el numero de inicio positivo entero: ")) 
Fin = int(input("Digíte el numero de fin: "))


print(f"El factorial de cada numero entre {Inicio} y {Fin} son:") 
# Itera desde Inicio hasta Fin (Fin + 1 para incluir Fin) 
for num in range(Inicio, Fin + 1): 
    print(f"El factorial de {num} es {factorial(num)}") 
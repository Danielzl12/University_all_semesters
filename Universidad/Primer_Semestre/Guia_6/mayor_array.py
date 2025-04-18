def mayor_array():
    lista = [1, 2, 5, 424, 54]  # Lista de números
    mayor = lista[0]
    for numero in lista:
        if numero > mayor:
            mayor = numero
    return mayor  # Devuelve el número mayor

print(mayor_array())  # Imprime el número mayor

mayor_array()
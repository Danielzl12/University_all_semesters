# Función para crear una matriz 3x3 ingresada por el usuario
def matriz():
    mat1=[]  # Lista para almacenar la matriz
    print("Ingrese los elementos de la matriz 3x3")
    for i in range(3):  # Recorre las filas
        fila=[]
        for j in range(3):  # Recorre las columnas
            # Solicita al usuario un número para cada posición de la matriz
            lista=int(input(f"Dame el numero para la posición: {i}, {j}: "))
            fila.append(lista)  # Agrega el número a la fila
        mat1.append(fila)  # Agrega la fila a la matriz
        
    print("\nMatriz ingresada:")
    for filaActual in mat1:  # Imprime cada fila de la matriz
        print("[",end=" ")
        for lista_actual in filaActual:
            print(lista_actual, end=" ")
        print("]")
    return mat1  # Devuelve la matriz creada

# Función para encontrar el elemento mayor en la matriz
def elementoMayor(matriz_a_evaluar):
    mayor=matriz_a_evaluar[0][0]  # Inicializa el mayor con el primer elemento
    
    for i in range(len(matriz_a_evaluar)):  # Recorre las filas
        for j in range(len(matriz_a_evaluar[i])):  # Recorre las columnas
            if matriz_a_evaluar[i][j]>mayor:  # Si encuentra un elemento mayor
                mayor = matriz_a_evaluar[i][j]  # Actualiza el mayor

    print(f"\nEl elemento mayor de la matriz es: {mayor}")  # Imprime el mayor
    return mayor  # Devuelve el mayor

# Llama a la función para crear la matriz y luego encuentra el elemento mayor
matriz_creada = matriz()
elementoMayor(matriz_creada)
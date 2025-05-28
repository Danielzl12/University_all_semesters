# Función para crear una matriz 3x3 ingresada por el usuario
def matriz():
    mat1=[]
    print("Ingrese los elementos de la matriz 3x3")
    for i in range(3):
        fila=[]
        for j in range(3):
            lista=int(input(f"Dame el numero para la posición: {i}, {j}: "))
            fila.append(lista)
        mat1.append(fila)
        
    print("\nMatriz ingresada:")
    for filaActual in mat1:
        print("[",end=" ")
        for lista_actual in filaActual:
            print(lista_actual, end=" ")
        print("]")
    return mat1

def matrizTranspuesta(matriz_a_evaluar):
    filas_original = len(matriz_a_evaluar)
    columnas_original = len(matriz_a_evaluar[0])

    # Crear una matriz transpuesta con dimensiones intercambiadas, inicializada con ceros
    matriz_transpuesta = [[0 for _ in range(filas_original)] for _ in range(columnas_original)]

    for i in range(filas_original):  # Recorre las filas de la original
        for j in range(columnas_original): # Recorre las columnas de la original
            matriz_transpuesta[j][i] = matriz_a_evaluar[i][j]
    
    print("\nMatriz Transpuesta:")
    for fila_transpuesta in matriz_transpuesta:
        print("[", end=" ")
        for elemento in fila_transpuesta:
            print(elemento, end=" ")
        print("]")
    
    return matriz_transpuesta # Opcional: devolver la matriz transpuesta

matrizCreada=matriz()
transpuesta = matrizTranspuesta(matrizCreada)
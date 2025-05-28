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

def sumaMatriz(matriz_a_evaluar):
    suma = 0
    for i in range(len(matriz_a_evaluar)):  # Recorre las filas
        for j in range(len(matriz_a_evaluar[i])):
            suma += matriz_a_evaluar[i][j]

    print(f"La suma de la matriz es {suma}")
    return suma

matrizCreada=matriz()
sumaMatriz(matrizCreada)
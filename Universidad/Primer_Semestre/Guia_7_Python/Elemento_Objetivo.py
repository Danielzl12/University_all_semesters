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

def objetivo(matriz_a_evaluar):
    numeroObjetivo= int(input(f"Ingrese el numero objetivo: "))
    encontrado = False
    posicion = None
    
    for i in range(len(matriz_a_evaluar)):  # Recorre las filas
        for j in range(len(matriz_a_evaluar[i])):  # Recorre las columnas
            if matriz_a_evaluar[i][j] == numeroObjetivo:
                encontrado = True
                posicion = (i, j)
                break
            if encontrado:
                break
            
    if encontrado:
        print(f"Se encontró el numero objetivo {numeroObjetivo} en la posición {posicion}")
    else:
        print(f"El numero objetivo {numeroObjetivo} no se encontró en la matriz.")

    return encontrado, posicion

matrizCreada=matriz()
encontrado, posicion=objetivo(matrizCreada)

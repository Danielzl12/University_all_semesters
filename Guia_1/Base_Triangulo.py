def baseTriangulo():
    base = int(input("Digíte la base del triangulo: "))
    altura = int(input("Digíte la altura del triangulo: "))
    area = (base*altura)/2
    # La 'f' en el print se utiliza para formatear la cadena e incluir el valor de 'area'
    # Puedes incluir variables y expresiones dentro de llaves {}
    print (f"El area del triangulo es: {area} ")
    
baseTriangulo()
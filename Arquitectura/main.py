def conversion():
    baseOrigen = int(input("Escriba la base de origen: "))
    baseDestino = int(input("Escriba la base de destino: "))
    numeroIngresado = input("Escriba el numero a convertir: ")
    largo = len(numeroIngresado)

    while baseOrigen < 0 or baseOrigen > 16:
        print("El numero ingresado no es valido. Debe estar entre 2 y 16.")
        baseOrigen = int(input("Escriba la base de origen: "))

    while baseDestino < 0 or baseDestino > 16:
        print("El numero ingresado no es valido. Debe estar entre 2 y 16.")
        baseDestino = int(input("Escriba la base de destino: "))


    numero_convertido_a_base_10 = 0
    potencia = len(numeroIngresado) - 1

    for digito in numeroIngresado:




        # Aquí dentro es donde tienes que:
        # 1. Convertir el 'digito' a su valor numérico (recuerda que 'A' es 10).
        # 2. Calcular su valor posicional: valor_del_digito * (baseOrigen ** potencia)
        # 3. Sumarlo a 'numero_convertido_a_base_10'.
        # 4. Restarle 1 a la 'potencia'.


conversion()

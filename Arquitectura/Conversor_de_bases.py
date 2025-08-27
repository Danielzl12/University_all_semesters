def convertir_base(numero_original, base_origen, base_destino):
    valores = {
        '0': 0, '1': 1, '2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7, '8': 8, '9': 9,
        'A': 10, 'B': 11, 'C': 12, 'D': 13, 'E': 14, 'F': 15
    }
    
    numero_en_decimal = 0
    potencia = 0
    
    for digito in numero_original[::-1]:
        valor_del_digito = valores[digito.upper()]
        numero_en_decimal += valor_del_digito * (base_origen ** potencia)
        potencia += 1

    digitos_resultado = "0123456789ABCDEF"
    numero_final = ""
    
    temp_decimal_para_conversion = numero_en_decimal
    
    if temp_decimal_para_conversion == 0:
        numero_final = '0'
    else:
        while temp_decimal_para_conversion > 0:
            residuo = temp_decimal_para_conversion % base_destino
            numero_final = digitos_resultado[residuo] + numero_final
            temp_decimal_para_conversion //= base_destino
    
    valor_binario = decimal_a_binario(numero_en_decimal)
    

    codigo_ascii = numero_en_decimal
    caracter_ascii = chr(codigo_ascii)

    return numero_final, numero_en_decimal, valor_binario, codigo_ascii, caracter_ascii

def decimal_a_binario(n):
    if n == 0:
        return "0"
    binario = ""
    while n > 0:
        binario = str(n % 2) + binario
        n //= 2
    return binario

print("CONVERSOR DE BASES NUMÉRICAS")

while True:
    base_M = int(input("Digíte la base de origen (2-16): "))
    if 2 <= base_M <= 16:
        break
    else:
        print("Error: La base debe ser un número entre 2 y 16.")

while True:
    base_N = int(input("Digíte la base de destino (2-16): "))
    if 2 <= base_N <= 16:
        break
    else:
        print("Error: La base debe ser un número entre 2 y 16.")

numero_str = input(f"Digíte el número en base {base_M}: ")

resultado, decimal, binario, ascii_val, ascii_char = convertir_base(numero_str, base_M, base_N)

print("\nRESULTADOS")
print(f"Número '{numero_str}' (base {base_M}) en base {base_N} es: {resultado}")
print(f"El valor del número en decimal (base 10) es: {decimal}")
print(f"El valor del número en binario es: {binario}")
print(f"El valor como código ASCII es: {ascii_val} = '{ascii_char}'")


'''Explicación sobre la codificación de caracteres (ASCII):
    
    El carácter que se muestra para un código numérico (ej: 230) depende de la "página de códigos"
    o "tabla de caracteres" que use el sistema operativo.
    
    - En la tabla 'Windows-1252' (común en web y sistemas modernos), el código 230 es 'æ'.
    - En la tabla 'Code Page 437' (común en la consola de Windows), el código 230 es 'µ'.
    
    El resultado que veas por medio de el teclado dependerá de la configuración del entorno.
    la tabla de "windows-1252" (la que usa python) es la siguiente
    https://www.ascii-code.com/es/tabla-de-codigos
    
    Puse esta breve explicación para justificar el uso de la función "chr" ya que yo no entendía el porque me daba diferente'''
    
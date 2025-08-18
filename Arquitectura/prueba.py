def convertir_a_decimal(numero_str, baseM):
    
    valores = "0123456789ABCDEF"
    numero_str = numero_str.upper()
    decimal = 0
    potencia = 1

    
    for digito in numero_str[::-1]:
        valor = valores.index(digito)
        decimal += valor * potencia
        potencia *= baseM
    return decimal


def convertir_desde_decimal(decimal, baseN):
    
    valores = "0123456789ABCDEF"
    if decimal == 0:
        return "0"
    resultado = ""
    while decimal > 0:
        resto = decimal % baseN
        resultado = valores[resto] + resultado
        decimal //= baseN
    return resultado


def convertir_a_binario(decimal):
    
    if decimal == 0:
        return "0"
    binario = ""
    while decimal > 0:
        binario = str(decimal % 2) + binario
        decimal //= 2
    return binario


def obtener_ascii(decimal):
    
    if 32 <= decimal <= 126:
        return chr(decimal)
    else:
        return "No corresponde a un caracter ASCII visible"


numero = input("Ingrese el numero a convertir: ")
baseM = int(input("Ingrese la base M (2-16): "))
baseN = int(input("Ingrese la base N (2-16): "))

decimal = convertir_a_decimal(numero, baseM)
print("Número en decimal:", decimal)

convertido = convertir_desde_decimal(decimal, baseN)
print(f"Número en base {baseN}: {convertido}")

binario = convertir_a_binario(decimal)
print("Número en binario:", binario)

ascii_char = obtener_ascii(decimal)
print("Carácter ASCII:", ascii_char)

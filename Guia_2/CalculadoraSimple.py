def Calculadora():
    N1=int(input("Digíte Numero 1:"))
    N2=int(input("Digíte Numero 2:"))
    Opción=int(input("Digíte 1.Suma 2.Resta 3.Multiplicación 4.División:"))
    if (Opción==1):
        Resultado = N1+N2
        print(f"resultado Suma = {Resultado}")
    if (Opción==2):
        Resultado = N1-N2
        print(f"resultado Resta: = {Resultado}")
    if (Opción==3):
        Resultado = N1*N2
        print(f"resultado Multiplicación: = {Resultado}")
    if (Opción==4):
        Resultado = N1/N2
        print(f"resultado División: = {Resultado}")
Calculadora()

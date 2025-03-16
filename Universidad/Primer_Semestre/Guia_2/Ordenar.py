def Ordenar():
    N1=float(input("Digíte Numero 1:"))
    N2=float(input("Digíte Numero 2:"))
    N3=float(input("Digíte Numero 3:"))
    if((N1>N2) and (N1>N3)):
        if (N2>=N3):
            print(f"{N1,N2,N3}")
    if((N1>N2) and (N1>N3)):
        if (N3>=N2):
            print(f"{N1,N3,N2}")
    if((N2>N3) and (N2>N1)):
        if (N1>=N3):
            print(f"{N2,N1,N3}")
    if((N2>N3) and (N2>N1)):
        if (N3>=N1):
            print(f"{N2,N3,N1}")
    if((N3>N1) and (N3>N2)):
        if (N1>=N2):
            print(f"{N3,N1,N2}")
    if((N3>N1) and (N3>N2)):
        if (N2>=N1):
            print(f"{N3,N2,N1}")
Ordenar()
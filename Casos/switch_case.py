def switch_case ():
    dia=float(input("Digíte numero del dia: "))
    match dia:
        case 1:
            print("Lunes")
        case 2:
            print("Martes")
        case 3:
            print("Miércoles")
        case 4:
            print("Jueves")
        case 5:
            print("Viernes")
        case 6:
            print("Sábado")
        case 7:
            print("Domingo")
        case _:
            print("Dia invalido")
switch_case()

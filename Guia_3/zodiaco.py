def zodiaco():
    dia = int(input("Digíte el día de nacimiento (1-31): "))
    mes = int(input("Digíte el mes de nacimiento (1-12): "))

    # Aries: 21 de marzo al 19 de abril
    if (mes == 3 and dia >= 21) or (mes == 4 and dia <= 19):
        print("Aries")
    # Tauro: 20 de abril al 20 de mayo
    elif (mes == 4 and dia >= 20) or (mes == 5 and dia <= 20):
        print("Tauro")
    # Géminis: 21 de mayo al 20 de junio
    elif (mes == 5 and dia >= 21) or (mes == 6 and dia <= 20):
        print("Géminis")
    # Cáncer: 21 de junio al 22 de julio
    elif (mes == 6 and dia >= 21) or (mes == 7 and dia <= 22):
        print("Cáncer")
    # Leo: 23 de julio al 22 de agosto
    elif (mes == 7 and dia >= 23) or (mes == 8 and dia <= 22):
        print("Leo")
    # Virgo: 23 de agosto al 22 de septiembre
    elif (mes == 8 and dia >= 23) or (mes == 9 and dia <= 22):
        print("Virgo")
    # Libra: 23 de septiembre al 22 de octubre
    elif (mes == 9 and dia >= 23) or (mes == 10 and dia <= 22):
        print("Libra")
    # Escorpio: 23 de octubre al 21 de noviembre
    elif (mes == 10 and dia >= 23) or (mes == 11 and dia <= 21):
        print("Escorpio")
    # Sagitario: 22 de noviembre al 21 de diciembre
    elif (mes == 11 and dia >= 22) or (mes == 12 and dia <= 21):
        print("Sagitario")
    # Capricornio: 22 de diciembre al 19 de enero
    elif (mes == 12 and dia >= 22) or (mes == 1 and dia <= 19):
        print("Capricornio")
    # Acuario: 20 de enero al 18 de febrero
    elif (mes == 1 and dia >= 20) or (mes == 2 and dia <= 18):
        print("Acuario")
    # Piscis: 19 de febrero al 20 de marzo
    elif (mes == 2 and dia >= 19) or (mes == 3 and dia <= 20):
        print("Piscis")
    else:
        print("Fecha inválida")
zodiaco()
def Nomina():
    SalarioMin = 1000000
    Nombre=input("Digíte Nombre:")
    PagoXH=int(input("Digíte Pago por hora:"))
    NroHoras=int(input("Digíte Numero de horas trabajadas:"))
    SalarioBruto = PagoXH * NroHoras
    if(SalarioBruto)<(SalarioMin *4):
        descuento=0
    elif(SalarioBruto)<=(SalarioMin *6):
        descuento=SalarioBruto *0.035
    elif(SalarioBruto)<=(SalarioMin *8):
        descuento=SalarioBruto *0.05
    elif(SalarioBruto)>(SalarioMin *8):
        descuento=SalarioBruto *0.07
    SalarioNeto = SalarioBruto - descuento
    print(f"Páguese a {Nombre} el valor de {SalarioNeto}")
Nomina()

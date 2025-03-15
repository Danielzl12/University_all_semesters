productos = {"1": ("Galletas", 1500), "2": ("Jugo", 2000), "3": ("Chocolate", 2500)}

print("Productos disponibles:")

for k, v in productos.items():
    print(f"{k}. {v[0]} - ${v[1]}")

op = input("Seleccione producto: ")

if op in productos:
    d = int(input("Ingrese dinero: "))
    if d >= productos[op][1]:
        print(f"Disfrute su {productos[op][0]}")
        if d > productos[op][1]:
            print(f"Cambio: ${d - productos[op][1]}")
    else:
        print("Dinero insuficiente.")
else:
    print("Selección inválida.")

from machine import Pin, PWM

# --- Script para Calibrar un Servomotor ---

# Asegúrate de que el pin sea el correcto
pin_servo = Pin(12, Pin.OUT) 
servo = PWM(pin_servo, freq=50)

print("--- Herramienta de Calibración de Servo ---")
print("Introduce valores de 'duty' para encontrar los límites de tu servo.")
print("Prueba con valores entre 15 y 140. Escribe 'salir' para terminar.")

while True:
    try:
        # Lee el valor que escribes en la consola de Thonny
        valor = input(">> Introduce un valor de duty: ")
        
        if valor.lower() == 'salir':
            break
        
        duty_val = int(valor)
        servo.duty(duty_val) # Mueve el servo al valor introducido
        print(f"Servo movido a duty = {duty_val}")

    except ValueError:
        print("Por favor, introduce un número entero válido o 'salir'.")

# Desactiva el servo para que no se fuerce
servo.deinit() 
print("Calibración finalizada.")
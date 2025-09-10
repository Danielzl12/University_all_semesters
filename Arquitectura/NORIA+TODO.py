from machine import Pin, PWM
from time import sleep

# --- Configuración del motor paso a paso ---
m1 = Pin(14, Pin.OUT)
m2 = Pin(27, Pin.OUT)
m3 = Pin(26, Pin.OUT)
m4 = Pin(25, Pin.OUT)

def salida(a, b, c, d):
    m1.value(a)
    m2.value(b)
    m3.value(c)
    m4.value(d)
    sleep(0.002)

def giro_pasos(cantidad):
    for _ in range(cantidad):
        salida(0, 0, 1, 1)
        salida(0, 1, 1, 0)
        salida(1, 1, 0, 0)
        salida(1, 0, 0, 1)

# --- Configuración del motorreductor ---
in3 = Pin(32, Pin.OUT)
in4 = Pin(13, Pin.OUT)
enb = PWM(Pin(33), freq=1000)

def adelante(vel):
    in3.value(1)
    in4.value(0)
    enb.duty(min(1023, int(vel * 1023)))

def parar_reductor():
    in3.value(0)
    in4.value(0)
    enb.duty(0)

def acelerar_adelante(velocidad_final, tiempo_total):
    pasos = 100
    tiempo_paso = tiempo_total / pasos
    in3.value(1)
    in4.value(0)
    for i in range(pasos + 1):
        vel = velocidad_final * (i / pasos)
        enb.duty(min(1023, int(vel * 1023)))
        sleep(tiempo_paso)
        
def desacelerar(velocidad_inicial, tiempo_total):
    pasos = 100
    tiempo_paso = tiempo_total / pasos
    for i in range(pasos + 1):
        vel = velocidad_inicial * (1 - (i / pasos))
        enb.duty(min(1023, int(vel * 1023)))
        sleep(tiempo_paso)
    parar_reductor()

# --- MODIFICADO: Configuración y control del Servomotor ---
pin_servo = Pin(12, Pin.OUT)
servo = PWM(pin_servo, freq=50)

# Ahora la función usa el valor de duty directamente
def mover_servo_a(duty_valor):
    """Mueve el servo a un valor de duty específico."""
    servo.duty(duty_valor)

# --- Lógica principal del programa ---

# --- Movimiento inicial del servo a tu posición deseada ---
print("Moviendo servo a la posición de trabajo (duty 118)...")
mover_servo_a(118)
sleep(1)






# --- Parte 1: Ciclo inicial de 8 paradas ---5

print("Vuelta Numero 1")
giro_pasos(105) 
parar_reductor()
sleep(2)

print("Vuelta Numero 2")
giro_pasos(110) 
parar_reductor()
sleep(2)

print("Vuelta Numero 3")
giro_pasos(105) 
parar_reductor()
sleep(2)

print("Vuelta Numero 4")
giro_pasos(108) 
parar_reductor()
sleep(2)

print("Vuelta Numero 5")
giro_pasos(114)
parar_reductor()
sleep(2)

print("Vuelta Numero 6")
giro_pasos(120) 
parar_reductor()
sleep(2)

print("Vuelta Numero 7")
giro_pasos(115) 
parar_reductor()
sleep(2)

print("Vuelta Numero 8")
giro_pasos(105) 
parar_reductor()
sleep(2)








# --- El servo vuelve a su posición inicial ---
print("Regresando servo a la posición de reposo (duty 65)...")
mover_servo_a(65)
sleep(1)

# --- Parte 2: El motor paso a paso da 16 vueltas mientras el reductor se mueve ---
print("Iniciando ciclo de 16 vueltas y movimiento del motorreductor...")
pasos_totales_noria = 882 * 16
velocidad_final = 0.4
adelante(0)
acelerar_adelante(velocidad_final, 5)
giro_pasos(pasos_totales_noria)
desacelerar(velocidad_final, 5)
print("Ciclo de 16 vueltas completado.")
sleep(2)

# --- Movimiento inicial del servo a tu posición deseada ---
print("Moviendo servo a la posición de trabajo (duty 118)...")
mover_servo_a(118)
sleep(1) 

# --- Parte 3: Ciclo final de 8 paradas ---

print("Vuelta Numero 1")
giro_pasos(105) 
parar_reductor()
sleep(2)

print("Vuelta Numero 2")
giro_pasos(110) 
parar_reductor()
sleep(2)

print("Vuelta Numero 3")
giro_pasos(105) 
parar_reductor()
sleep(2)

print("Vuelta Numero 4")
giro_pasos(108) 
parar_reductor()
sleep(2)

print("Vuelta Numero 5")
giro_pasos(114)
parar_reductor()
sleep(2)

print("Vuelta Numero 6")
giro_pasos(120) 
parar_reductor()
sleep(2)

print("Vuelta Numero 7")
giro_pasos(115) 
parar_reductor()
sleep(2)

print("Vuelta Numero 8")
giro_pasos(105) 
parar_reductor()
sleep(2)

# --- El servo vuelve a su posición inicial ---
print("Regresando servo a la posición de reposo (duty 65)...")
mover_servo_a(65)
sleep(1)

# --- Apagado final de todos los motores ---
print("Proceso finalizado. Apagando todos los motores.")
servo.deinit()
salida(0, 0, 0, 0)
parar_reductor()
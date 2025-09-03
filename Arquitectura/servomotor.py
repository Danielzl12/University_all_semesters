from machine import Pin
from time import sleep

# --- Tus funciones originales (sin cambios) ---

# Definir los pines conectados al ULN2003
m1 = Pin(14, Pin.OUT)
m2 = Pin(27, Pin.OUT)
m3 = Pin(26, Pin.OUT)
m4 = Pin(25, Pin.OUT)

def salida (a,b,c,d):
    m1.value(a)
    m2.value(b)
    m3.value(c)
    m4.value(d)
    sleep(0.002)

def giro(cantidad):
    for i in range (cantidad):
        salida (0,0,1,1)
        salida (0,1,1,0)
        salida (1,1,0,0)
        salida (1,0,0,1)


for _ in range(4):
    giro(165)
    sleep(2)


for _ in range(1):
    giro(670)

sleep(4)

for _ in range(4):
    giro(165)
    sleep(0.5)  
# Apaga las bobinas al finalizar todo el proceso
salida(0,0,0,0)
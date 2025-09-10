# dc_motor.py
from machine import Pin, PWM
from time import sleep

class DCMotor:
    def __init__(self, pin_in3, pin_in4, pin_enb):
        self.in3 = Pin(pin_in3, Pin.OUT)
        self.in4 = Pin(pin_in4, Pin.OUT)
        self.enb = PWM(Pin(pin_enb), freq=1000)

    def parar(self):
        self.in3.value(0)
        self.in4.value(0)
        self.enb.duty(0)

    def acelerar_adelante(self, velocidad_final, tiempo_total):
        pasos = 100
        tiempo_paso = tiempo_total / pasos
        self.in3.value(1)
        self.in4.value(0)
        
        for i in range(pasos + 1):
            # --- LÓGICA MEJORADA: ACELERACIÓN SUAVE (EASE-IN) ---
            # 't' es un valor que va de 0.0 a 1.0 durante el bucle
            t = i / pasos
            # Al elevar 't' al cuadrado, el crecimiento al inicio es muy lento
            # y se acelera hacia el final, resultando en un arranque suave.
            factor_aceleracion = t * t
            
            vel = velocidad_final * factor_aceleracion
            self.enb.duty(min(1023, int(vel * 1023)))
            sleep(tiempo_paso)
            
    def desacelerar(self, velocidad_inicial, tiempo_total):
        pasos = 100
        tiempo_paso = tiempo_total / pasos
        
        for i in range(pasos + 1):
            # --- LÓGICA MEJORADA: DESACELERACIÓN SUAVE (EASE-OUT) ---
            t = i / pasos
            # La lógica inversa para un frenado suave
            factor_desaceleracion = (1 - t) * (1 - t)

            vel = velocidad_inicial * factor_desaceleracion
            self.enb.duty(min(1023, int(vel * 1023)))
            sleep(tiempo_paso)
        self.parar()
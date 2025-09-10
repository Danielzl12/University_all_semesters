# stepper_motor.py
from machine import Pin
from time import sleep

class StepperMotor:
    def __init__(self, pin1, pin2, pin3, pin4):
        self.m1 = Pin(pin1, Pin.OUT)
        self.m2 = Pin(pin2, Pin.OUT)
        self.m3 = Pin(pin3, Pin.OUT)
        self.m4 = Pin(pin4, Pin.OUT)

    def _salida(self, a, b, c, d):
        self.m1.value(a)
        self.m2.value(b)
        self.m3.value(c)
        self.m4.value(d)
        sleep(0.002)

    def giro_pasos(self, cantidad):
        for _ in range(cantidad):
            self._salida(0, 0, 1, 1)
            self._salida(0, 1, 1, 0)
            self._salida(1, 1, 0, 0)
            self._salida(1, 0, 0, 1)
            
    def apagar(self):
        self._salida(0, 0, 0, 0)
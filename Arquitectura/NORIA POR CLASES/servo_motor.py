# servo_motor.py
from machine import Pin, PWM

class ServoMotor:
    def __init__(self, pin_servo):
        self.servo = PWM(Pin(pin_servo), freq=50)

    def mover_a(self, duty_valor):
        self.servo.duty(duty_valor)
        
    def apagar(self):
        self.servo.deinit()
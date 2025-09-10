# main.py
from time import sleep
# Importamos las clases que acabamos de crear
from stepper_motor import StepperMotor
from dc_motor import DCMotor
from servo_motor import ServoMotor

class NoriaController:
    def __init__(self):
        # Creamos los objetos a partir de nuestras clases importadas
        self.motor_pasos = StepperMotor(pin1=14, pin2=27, pin3=26, pin4=25)
        self.motor_reductor = DCMotor(pin_in3=32, pin_in4=13, pin_enb=33)
        self.servo = ServoMotor(pin_servo=12)

    def ejecutar_secuencia(self):
        # La lógica principal no cambia, solo cómo llama a las funciones
        
        print("Moviendo servo a la posición de trabajo (duty 118)...")
        self.servo.mover_a(118)
        sleep(1)

        print("Iniciando Parte 1: Ciclo de 8 paradas...")
        vueltas_parte1 = [105, 110, 105, 108, 114, 120, 115, 105]
        for i, pasos in enumerate(vueltas_parte1):
            print(f"Vuelta Numero {i + 1}")
            self.motor_pasos.giro_pasos(pasos)
            sleep(2)

        print("Regresando servo a la posición de reposo (duty 65)...")
        self.servo.mover_a(65)
        sleep(1)

        print("Iniciando Parte 2: 16 vueltas y movimiento del motorreductor...")
        pasos_totales_noria = 882 * 16
        velocidad_final = 0.4
        self.motor_reductor.acelerar_adelante(velocidad_final, 5)
        self.motor_pasos.giro_pasos(pasos_totales_noria)
        self.motor_reductor.desacelerar(velocidad_final, 5)
        print("Ciclo de 16 vueltas completado.")
        sleep(2)
        
        print("Moviendo servo a la posición de trabajo (duty 118)...")
        self.servo.mover_a(118)
        sleep(1) 

        print("Iniciando Parte 3: Ciclo final de 8 paradas...")
        vueltas_parte3 = [105, 110, 105, 108, 114, 120, 115, 105]
        for i, pasos in enumerate(vueltas_parte3):
            print(f"Vuelta Numero {i + 1}")
            self.motor_pasos.giro_pasos(pasos)
            sleep(2)

        print("Regresando servo a la posición de reposo (duty 65)...")
        self.servo.mover_a(65)
        sleep(1)

        print("Proceso finalizado. Apagando todos los motores.")
        self.servo.apagar()
        self.motor_pasos.apagar()
        self.motor_reductor.parar()

# --- Punto de entrada ---
if __name__ == "__main__":
    noria = NoriaController()
    noria.ejecutar_secuencia()
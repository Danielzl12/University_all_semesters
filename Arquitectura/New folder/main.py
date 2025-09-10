from tm1637 import TM1637
from machine import Pin
import time
tm = TM1637(clk=Pin(2), dio=Pin(5))

def num_prim(n):
    if n<=2:
        return False
    for i in range (2, int (n**0.5)+1 ):
        if n%i==0:
            return False
        return True
def prim(total):
    for numero in range (2, total+1):
        if num_prim(numero):
            tm.number(numero)
            time.sleep(0.5)
#prim(10000)
def numeros(dato):
    for i in range (10,dato,2):
        tm.number(i)
        time.sleep(0.2)
#numeros(16)
tm.number(12)
time.sleep(0.2)
tm.show("8888")
time.sleep(0.2)
tm.scroll('8888')
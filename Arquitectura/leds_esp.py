from machine import Pin
from utime import sleep

led=Pin(13,Pin.OUT)
led2=Pin(21,Pin.OUT)
led3=Pin(14,Pin.OUT)
led4=Pin(12,Pin.OUT)
led5=Pin(26,Pin.OUT)
led6=Pin(27,Pin.OUT)
led7=Pin(33,Pin.OUT)
led8=Pin(25,Pin.OUT)

while True:
    led.on()
    sleep(0.1)
    led.off()
    sleep(0.1)
    
    led2.on()
    sleep(0.1)
    led2.off()
    sleep(0.1)
    
    led3.on()
    sleep(0.1)
    led3.off()
    sleep(0.1)
    
    led4.on()
    sleep(0.1)
    led4.off()
    sleep(0.1)
    
    led5.on()
    sleep(0.1)
    led5.off()
    sleep(0.1)
    
    led6.on()
    sleep(0.1)
    led6.off()
    sleep(0.1)
    
    led7.on()
    sleep(0.1)
    led7.off()
    sleep(0.1)
    
    led8.on()
    sleep(0.1)
    led8.off()
    sleep(0.1)
    
    
# NeoPixels Rainbow on MicroPython
# Wokwi Example https://wokwi.com/arduino/projects/305569065545499202

from machine import Pin
from neopixel import NeoPixel
from time import sleep

rainbow = [
  (255,255,255,),(114 , 13 , 0),(102 , 25 , 0),(90 , 37 , 0),(78 , 49 , 0),(66 , 61 , 0),(54 , 73 , 0),(42 , 85 , 0),
  (30 , 97 , 0),(18 , 109 , 0),(6 , 121 , 0),(0 , 122 , 5),(0 , 110 , 17),(0 , 98 , 29),(0 , 86 , 41),(42,85,0),
  ]


pixels = NeoPixel(Pin(15), 16)
while True:
    for j in range (16):
        print (len(rainbow))
        rainbow = rainbow[-1:] + rainbow[:-1]
        for i in range(16):
            pixels[i] = rainbow[i]
        pixels.write()

        sleep(0.1)
    for j in range (16):
        rainbow = rainbow[1:] + rainbow[:1]
        print (len(rainbow))
        for i in range(16):
            pixels[i] = rainbow[i]
        pixels.write()
        sleep(0.1)



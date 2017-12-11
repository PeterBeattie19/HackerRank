#!/bin/python3

import sys


q = int(input().strip())
for a0 in range(q):
    x,y,z = input().strip().split(' ')
    x,y,z = [int(x),int(y),int(z)]
    
    a = abs(x-z)
    b = abs(y-z)
    if a==b:
        print("Mouse C")
        continue
    if a < b:
        print("Cat A")
        continue
    
    if b < a:
        print("Cat B")
        continue

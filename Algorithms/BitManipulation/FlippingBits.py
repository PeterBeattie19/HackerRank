#!/bin/python3

import sys

def flippingBits(N):
    # Complete this function
    res = ""
    s = bin(N)[2:]
    
    if len(s) < 32:
        s = ("0")*(32 - len(s)) + s
    for i in s:
        res += "0" if i == '1' else "1"
        
    
    return int(res,2)

if __name__ == "__main__":
    T = int(input().strip())
    for a0 in range(T):
        N = int(input().strip())
        result = flippingBits(N)
        print(result)

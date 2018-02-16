#!/bin/python

import sys

def sockMerchant(n, ar):
    # Complete this function
    count = [0]*101
    
    for i in ar:
        count[i] += 1
        
    c = 0
    for i in count:
        c += i/2
        
        
    return c

n = int(raw_input().strip())
ar = map(int, raw_input().strip().split(' '))
result = sockMerchant(n, ar)
print(result)

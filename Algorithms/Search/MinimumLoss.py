#!/bin/python

import sys

def minimumLoss(price):
    arr = price
    
    look = {}
    for i in range(len(price)):
        look[arr[i]] = i
        
    #print look
   # print arr
    
    minDiff = 10000000000000001
    arr.sort()
    for i in range(len(price)-1):
        if look[arr[i]] > look[arr[i+1]] and  abs(arr[i] - arr[i+1]) < minDiff:
            minDiff = abs(arr[i] - arr[i+1])
            
    return abs(minDiff)
        
    
if __name__ == "__main__":
    n = int(raw_input().strip())
    price = map(long, raw_input().strip().split(' '))
    result = minimumLoss(price)
    print result

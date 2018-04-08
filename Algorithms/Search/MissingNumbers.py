#!/bin/python

import sys

def missingNumbers(arr, brr):
    # Complete this function
    freqA = {}
    freqB = {}
    s = set()
    
    for i in arr:
        if i in freqA:
            temp = freqA[i]
            freqA[i] = temp+1
        else:
            freqA[i] = 1
        s.add(i)
            
    for i in brr:
        if i in freqB:
            temp = freqB[i]
            freqB[i] = temp+1
        else:
            freqB[i] = 1
        s.add(i)
        
    
    ans = []
    for i in s:
        if freqA[i] != freqB[i]:
            ans.append(i)
            
    ans.sort()
    
    return ans
            
    

if __name__ == "__main__":
    n = int(raw_input().strip())
    arr = map(int, raw_input().strip().split(' '))
    m = int(raw_input().strip())
    brr = map(int, raw_input().strip().split(' '))
    result = missingNumbers(arr, brr)
    print " ".join(map(str, result))



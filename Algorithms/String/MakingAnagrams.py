#!/bin/python

import sys

def makingAnagrams(s1, s2):
    s = {'a':0 , 'b':1, 'c':2, 'd':3, 'e':4, 'f':5, 'g':6, 'h':7, 'i':8, 'j':9, 'k':10, 'l':11, 'm':12, 'n':13, 'o':14, 'p':15, 'q':16, 'r':17, 's':18, 't':19, 'u':20, 'v':21, 'w':22, 'x':23, 'y':24, 'z':25, }
    
    arr1 = [0]*26
    arr2 = [0]*26
    
    for i in range(len(s1)):
        arr1[s[s1[i]]] += 1
    
    for i in range(len(s2)):
        arr2[s[s2[i]]] += 1
        
    count = 0
        
    for i in range(0,26):
        diff = abs(arr1[i] - arr2[i])
        count += diff
    return count
        
    # Complete this function

s1 = raw_input().strip()
s2 = raw_input().strip()
result = makingAnagrams(s1, s2)
print(result)

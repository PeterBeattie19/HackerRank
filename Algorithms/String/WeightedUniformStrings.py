#!/bin/python

from __future__ import print_function

import os
import sys

#
# Complete the weightedUniformStrings function below.
#
def weightedUniformStrings(s, queries):
    se = {'a':0 , 'b':1, 'c':2, 'd':3, 'e':4, 'f':5, 'g':6, 'h':7, 'i':8, 'j':9, 'k':10, 'l':11, 'm':12, 'n':13, 'o':14, 'p':15, 'q':16, 'r':17, 's':18, 't':19, 'u':20, 'v':21, 'w':22, 'x':23, 'y':24, 'z':25, }
    
    results = [0]*26
    res = []
    string = "" 
    ints = {}
    total = se[s[0]]+1
    
    for i in range(len(s)):
        ints[total] = total
        
        if i == len(s)-1:
            break
            
        if s[i] != s[i+1]:
            total = se[s[i+1]]+1
            
        else:
            total += se[s[i+1]] + 1

            
    for q in queries:
        if q in ints:
            string += "Yes\n"
        else:
            string += "No\n"
            
    return string
            


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = raw_input()

    queries_count = int(raw_input())

    queries = []

    for _ in xrange(queries_count):
        queries_item = int(raw_input())
        queries.append(queries_item)

    result = weightedUniformStrings(s, queries)

    fptr.write(result)

    fptr.close()

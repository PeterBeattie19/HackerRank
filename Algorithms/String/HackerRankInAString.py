#!/bin/python

import sys

def hackerrankInString(s):
    # Complete this function
    a = 'hackerrank'
    j = 0
    c = 0
    for i in s:
        if i == a[j]:
            c+=1
            j += 1
        if j == len(a):
            return 'YES'
    return 'NO'  

if __name__ == "__main__":
    q = int(raw_input().strip())
    for a0 in xrange(q):
        s = raw_input().strip()
        result = hackerrankInString(s)
        print result


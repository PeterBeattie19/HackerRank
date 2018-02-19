#!/bin/python

import sys

def findDigits(n):
    # Complete this function
    s = str(n)
    count = 0
    for i in s:
        if i!='0' and n%(int(i)) == 0:
            count += 1
    return count; 

if __name__ == "__main__":
    t = int(raw_input().strip())
    for a0 in xrange(t):
        n = int(raw_input().strip())
        result = findDigits(n)
        print result


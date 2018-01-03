#!/bin/python

import sys

def angryProfessor(k, a):
    # Complete this function
    c = 0
    for i in a:
        if i <= 0:
            c += 1
    
    if c >= k:
        return "NO"
    return "YES"

if __name__ == "__main__":
    t = int(raw_input().strip())
    for a0 in xrange(t):
        n, k = raw_input().strip().split(' ')
        n, k = [int(n), int(k)]
        a = map(int, raw_input().strip().split(' '))
        result = angryProfessor(k, a)
        print result


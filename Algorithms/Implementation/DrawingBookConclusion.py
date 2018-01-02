#!/bin/python

import sys

def solve(n, p):
    # Complete this function
    return min(p/2,n/2-p/2)

n = int(raw_input().strip())
p = int(raw_input().strip())
result = solve(n, p)
print(result)
